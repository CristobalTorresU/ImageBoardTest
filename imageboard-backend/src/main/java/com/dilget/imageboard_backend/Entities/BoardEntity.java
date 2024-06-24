package com.dilget.imageboard_backend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "board")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
  
  @Id
  @Column(unique = true, nullable = false)
  private String code;

}
