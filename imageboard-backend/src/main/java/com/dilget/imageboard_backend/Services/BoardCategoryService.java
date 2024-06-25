package com.dilget.imageboard_backend.Services;

import com.dilget.imageboard_backend.Entities.BoardCategoryEntity;
import com.dilget.imageboard_backend.Repositories.BoardCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardCategoryService {
    @Autowired
    BoardCategoryRepository boardCategoryRepository;

    public ArrayList<BoardCategoryEntity> getAllBoardCategories() {
        return (ArrayList<BoardCategoryEntity>) boardCategoryRepository.findAll();
    }

    public BoardCategoryEntity getBoardCategoryById(Long id) {
        return boardCategoryRepository.findById(id).orElse(null);
    }

    public BoardCategoryEntity addBoardCategory(BoardCategoryEntity boardCategoryEntity) {
        return boardCategoryRepository.save(boardCategoryEntity);
    }

    public BoardCategoryEntity updateBoardCategory(BoardCategoryEntity boardCategoryEntity) {
        return boardCategoryRepository.save(boardCategoryEntity);
    }

    public void deleteBoardCategory(Long id) {
        boardCategoryRepository.deleteById(id);
    }
}
