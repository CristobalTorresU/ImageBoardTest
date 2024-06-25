package com.dilget.imageboard_backend.Services;

import com.dilget.imageboard_backend.Entities.ThreadEntity;
import com.dilget.imageboard_backend.Repositories.ThreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadService {
    @Autowired
    ThreadRepository threadRepository;

    public ArrayList<ThreadEntity> getAllThreads() {
        return (ArrayList<ThreadEntity>) threadRepository.findAll();
    }

    public ThreadEntity saveThread(ThreadEntity thread) {
        thread.setArchived(false);
        thread.setPinned(false);
        thread.setReplyCount(0);
        thread.setImageCount(0);
        thread.setDate(LocalDate.now());
        thread.setTime(LocalTime.now());
        if (thread.getSubject() == null) {
            thread.setSubject("");
        }
        if (thread.getUsername() == null) {
            thread.setUsername("Anonymous");
        }
        return threadRepository.save(thread);
    }

    public ThreadEntity getThreadById(Long id) {
        return threadRepository.findById(id).orElse(null);
    }

    public List<ThreadEntity> getThreadsByBoardId(Long board) {
        return threadRepository.findByBoard_id(board);
    }

    public boolean deleteThread(Long id) throws Exception {
        try {
            threadRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
