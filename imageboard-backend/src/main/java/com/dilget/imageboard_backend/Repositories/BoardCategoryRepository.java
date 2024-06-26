package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.BoardCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardCategoryRepository extends JpaRepository<BoardCategoryEntity, Long> {
}
