package com.example.demo.repository;

import com.example.demo.models.entity.Article;
import com.example.demo.models.ArticleStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    Page<Article> findAllByArticleStatus(ArticleStatus articleStatus, Pageable pageable);
}
