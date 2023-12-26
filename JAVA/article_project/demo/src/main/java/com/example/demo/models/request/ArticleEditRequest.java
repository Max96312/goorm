package com.example.demo.models.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ArticleEditRequest {
    private Long articleId;
    private String content;
}
