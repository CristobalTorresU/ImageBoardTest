package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long>{
}
