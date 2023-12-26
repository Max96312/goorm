package com.example.demo.models.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleRequest {
    private String title;
    private String content;
//
//    public Article toEntity() {
//        return new Article(null, title, content);
//    }
}