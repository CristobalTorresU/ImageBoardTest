package com.dilget.imageboard_backend.Controllers;

import com.dilget.imageboard_backend.Entities.ReplyEntity;
import com.dilget.imageboard_backend.Services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reply")
@CrossOrigin("*")
public class ReplyController {
    @Autowired
    ReplyService replyService;

    @GetMapping("/")
    public ResponseEntity<List<ReplyEntity>> getAllReplies() {
        List<ReplyEntity> replies = replyService.getAllReplies();
        return ResponseEntity.ok(replies);
    }

    @GetMapping("/${id}")
    public ResponseEntity<ReplyEntity> getReplyById(@PathVariable Long id) {
        ReplyEntity reply = replyService.getReplyById(id);
        return ResponseEntity.ok(reply);
    }

    @GetMapping("/${thread_id}")
    public ResponseEntity<List<ReplyEntity>> getRepliesByThread_id(@PathVariable Long thread_id) {
        List<ReplyEntity> replies = replyService.getRepliesByThread_id(thread_id);
        return ResponseEntity.ok(replies);
    }

    @PostMapping("/")
    public ResponseEntity<ReplyEntity> saveReply(ReplyEntity reply) {
        ReplyEntity savedReply = replyService.saveReply(reply);
        return ResponseEntity.ok(savedReply);
    }

    @DeleteMapping("/${id}")
    public ResponseEntity<Boolean> deleteReply(@PathVariable Long id) {
        try {
            replyService.deleteReply(id);
            return ResponseEntity.ok(true);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
}
