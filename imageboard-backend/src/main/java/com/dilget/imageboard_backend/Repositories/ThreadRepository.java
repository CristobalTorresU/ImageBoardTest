package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.ThreadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThreadRepository extends JpaRepository<ThreadEntity, Long> {

    @Query(value = "SELECT * FROM threads WHERE thread.board_id = :board_id", nativeQuery = true)
    public List<ThreadEntity> findByBoard_id(@Param("board_id") Long board_id);
}
