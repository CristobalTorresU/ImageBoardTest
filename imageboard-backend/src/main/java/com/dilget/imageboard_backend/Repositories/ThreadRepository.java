package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.ThreadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepository extends JpaRepository<ThreadEntity, Long> {
}
