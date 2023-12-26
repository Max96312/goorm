package com.example.demo.models.response;


import com.example.demo.models.entity.Article;
import com.example.demo.models.ArticleStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ArticleResponse {
    private Long articleId;
    private String title;
    private String content;
    private ArticleStatus status;

    static public ArticleResponse from(Article article){
        return ArticleResponse.builder()
                .articleId(article.getArticleId())
                .title(article.getTitle())
                .content(article.getContent())
                .status(article.getArticleStatus())
                .build();
    }

}
