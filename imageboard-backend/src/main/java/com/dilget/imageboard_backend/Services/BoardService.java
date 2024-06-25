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
    @Autowired
    BoardCategoryService boardCategoryService;

    public ArrayList<BoardEntity> getAllBoards() {
        return (ArrayList<BoardEntity>) boardRepository.findAll();
    }

    public BoardEntity saveBoard(BoardEntity board) {
        if (boardCategoryService.getBoardCategoryById(board.getCategory()) != null){
            return null;
        }
        return boardRepository.save(board);
    }

    public BoardEntity getBoardById(Long id) {
        return boardRepository.findBoardById(id);
    }

    public boolean deleteBoard(Long id) throws Exception {
        try {
            boardRepository.deleteBoardById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
