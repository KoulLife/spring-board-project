package com.Discipline.projectboard.repository;

import com.Discipline.projectboard.config.JpaConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA access test")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {
  private final ArticleRepository articleRepository;
  private final ArticleCommentRepository articleCommentRepository;

  public JpaRepositoryTest(
          @Autowired ArticleRepository articleRepository,
          @Autowired ArticleCommentRepository articleCommentRepository
  ){
    this.articleRepository = articleRepository;
    this.articleCommentRepository = articleCommentRepository;
  }

  @DisplayName("Select TEST")
  @Test
  void givenTestData_whenSelecting_thenWorksFine(){
    //GIVEN

    //WHEN

    //THEN
  }
}