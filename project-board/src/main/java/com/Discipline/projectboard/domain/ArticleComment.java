package com.Discipline.projectboard.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ArticleComment {
  private Long id;
  private Article article;
  private String content;

  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDate modifiedAt;
  private String modifiedBy;
}
