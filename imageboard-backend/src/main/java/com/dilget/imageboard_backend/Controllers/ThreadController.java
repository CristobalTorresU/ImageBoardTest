package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/threads")
@CrossOrigin("*")
public class ThreadController {
    @Autowired
    ThreadService threadService;
}
