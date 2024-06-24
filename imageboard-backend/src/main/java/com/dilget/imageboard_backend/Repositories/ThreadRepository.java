package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.ThreadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThreadRepository extends JpaRepository<ThreadEntity, Long> {
    public List<ThreadEntity> findByBoard_id(String board_id);
}
