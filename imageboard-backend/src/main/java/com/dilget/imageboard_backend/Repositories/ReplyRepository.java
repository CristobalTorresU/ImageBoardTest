package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long>{

    @Query(value = "SELECT * FROM reply WHERE reply.thread_id = :thread_id", nativeQuery = true)
    public List<ReplyEntity> getReplyEntityByThread_id(@Param("thread_id") Long thread_id);
}
