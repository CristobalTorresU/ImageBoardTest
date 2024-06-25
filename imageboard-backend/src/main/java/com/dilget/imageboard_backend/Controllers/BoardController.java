package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Entities.BoardEntity;
import com.dilget.imageboard_backend.Services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
@CrossOrigin("*")
public class BoardController {
    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public ResponseEntity<List<BoardEntity>> getAllBoards() {
        List<BoardEntity> boards = boardService.getAllBoards();
        return ResponseEntity.ok(boards);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardEntity> getBoardById(@PathVariable Long id) {
        BoardEntity board = boardService.getBoardById(id);
        return ResponseEntity.ok(board);
    }

    @PostMapping("/")
    public ResponseEntity<BoardEntity> saveBoard(@RequestBody BoardEntity board) {
        BoardEntity savedBoard = boardService.saveBoard(board);
        return ResponseEntity.ok(savedBoard);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBoard(@PathVariable Long id) {
        try {
            boardService.deleteBoard(id);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
}
