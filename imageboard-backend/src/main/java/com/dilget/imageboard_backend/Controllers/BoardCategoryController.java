package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Entities.BoardCategoryEntity;
import com.dilget.imageboard_backend.Services.BoardCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board-category")
@CrossOrigin("*")
public class BoardCategoryController {
    @Autowired
    BoardCategoryService boardCategoryService;

    @GetMapping("/")
    public Object getAllBoardCategories() {
        return boardCategoryService.getAllBoardCategories();
    }

    @GetMapping("{id}")
    public Object getBoardCategoryById(@PathVariable Long id) {
        return boardCategoryService.getBoardCategoryById(id);
    }

    @PostMapping("/")
    public BoardCategoryEntity addBoardCategory(@RequestBody BoardCategoryEntity boardCategory) {
        return boardCategoryService.addBoardCategory(boardCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteBoardCategory(@PathVariable Long id) {
        boardCategoryService.deleteBoardCategory(id);
    }
}
