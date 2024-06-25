package com.dilget.imageboard_backend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "thread")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreadEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "image_id", referencedColumnName = "id")
  private ImageEntity image;

  private String subject;
  private String username;
  private LocalDate date;
  private LocalTime time;
  private String message;
  private int replyCount;
  private int imageCount;
  private boolean isArchived;
  private boolean isPinned;
  private Long board_id;
}
