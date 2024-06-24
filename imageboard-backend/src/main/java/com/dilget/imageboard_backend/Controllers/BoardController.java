package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boards")
@CrossOrigin("*")
public class BoardController {
    @Autowired
    BoardService boardService;
}
