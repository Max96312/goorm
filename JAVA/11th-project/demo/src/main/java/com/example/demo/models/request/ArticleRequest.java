package com.example.demo.models.request;

import com.example.demo.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class ArticleRequest {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}