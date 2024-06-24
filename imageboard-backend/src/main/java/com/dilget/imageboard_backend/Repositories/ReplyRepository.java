package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long>{
    public List<ReplyEntity> getReplyEntityByThread_id(Long thread_id);
}
