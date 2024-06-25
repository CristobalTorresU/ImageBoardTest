package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Entities.ThreadEntity;
import com.dilget.imageboard_backend.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/threads")
@CrossOrigin("*")
public class ThreadController {
    @Autowired
    ThreadService threadService;

    @GetMapping("/")
    public ResponseEntity<List<ThreadEntity>> getAllThreads() {
        List<ThreadEntity> threads = threadService.getAllThreads();
        return ResponseEntity.ok(threads);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThreadEntity> getThreadById(@PathVariable Long id) {
        ThreadEntity thread = threadService.getThreadById(id);
        return ResponseEntity.ok(thread);
    }

    @GetMapping("/{board}")
    public ResponseEntity<List<ThreadEntity>> getThreadsByBoardId(@PathVariable Long board) {
        List<ThreadEntity> threads = threadService.getThreadsByBoardId(board);
        return ResponseEntity.ok(threads);
    }

    @PostMapping("/")
    public ResponseEntity<ThreadEntity> createThread(@RequestBody ThreadEntity thread) {
        ThreadEntity savedThread = threadService.saveThread(thread);
        return ResponseEntity.ok(savedThread);
    }

    @PutMapping("/")
    public ResponseEntity<ThreadEntity> updatedThread(@RequestBody ThreadEntity thread) {
        ThreadEntity updatedThread = threadService.saveThread(thread);
        return ResponseEntity.ok(updatedThread);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteThread(@PathVariable Long id) {
        try {
            threadService.deleteThread(id);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
}
