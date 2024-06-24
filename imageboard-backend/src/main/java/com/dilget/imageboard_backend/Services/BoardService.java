package com.dilget.imageboard_backend.Services;

import com.dilget.imageboard_backend.Entities.BoardEntity;
import com.dilget.imageboard_backend.Repositories.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public ArrayList<BoardEntity> getAllBoards() {
        return (ArrayList<BoardEntity>) boardRepository.findAll();
    }

    public BoardEntity saveBoard(BoardEntity board) {
        return boardRepository.save(board);
    }

    public BoardEntity getBoardById(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    public boolean deleteBoard(Long id) throws Exception {
        try {
            boardRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
