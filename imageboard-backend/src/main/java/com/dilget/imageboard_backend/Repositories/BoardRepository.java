package com.dilget.imageboard_backend.Repositories;

import com.dilget.imageboard_backend.Entities.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long>{

    @Query(value = "SELECT * FROM board WHERE board.id = :id", nativeQuery = true)
    BoardEntity findBoardById(@Param("id") Long id);

    @Query(value = "DELETE FROM board WHERE board.id = :id", nativeQuery = true)
    BoardEntity deleteBoardById(@Param("id") Long id);
}
