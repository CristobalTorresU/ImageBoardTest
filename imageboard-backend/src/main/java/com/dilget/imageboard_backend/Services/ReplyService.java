package com.dilget.imageboard_backend.Services;

import com.dilget.imageboard_backend.Entities.ReplyEntity;
import com.dilget.imageboard_backend.Repositories.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReplyService {
    @Autowired
    ReplyRepository replyRepository;

    public ArrayList<ReplyEntity> getAllReplies() {
        return (ArrayList<ReplyEntity>) replyRepository.findAll();
    }

    public ReplyEntity saveReply(ReplyEntity reply) {
        return replyRepository.save(reply);
    }

    public ReplyEntity getReplyById(Long id) {
        return replyRepository.findById(id).orElse(null);
    }

    public ReplyEntity updateReply(ReplyEntity reply) {
        return replyRepository.save(reply);
    }

    public boolean deleteReply(Long id) throws Exception {
        try {
            replyRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
