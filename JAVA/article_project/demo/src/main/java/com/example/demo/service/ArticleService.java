package com.example.demo.service;

import com.example.demo.models.entity.Article;
import com.example.demo.models.ArticleStatus;
import com.example.demo.models.response.ArticleResponse;
import com.example.demo.repository.ArticleRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
//@RequiredArgsConstructor
@Slf4j
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleResponse writeArticle (String title, String content){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setArticleStatus(ArticleStatus.ACTIVE);

        return ArticleResponse.from(articleRepository.save(article));
    }

    public ArticleResponse getArticle(Long articleId){
        return articleRepository.findById(articleId)
                .filter(Article::isActive)
                .map(ArticleResponse::from)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 게시글 입니다."));
    }

    public List<ArticleResponse> searchArticleList(int page, int pageSize){
        return articleRepository.findAllByArticleStatus(ArticleStatus.ACTIVE,
                PageRequest.of(page, pageSize, Sort.by(Sort.Direction.DESC, "articleId")))
                .map(ArticleResponse::from).toList();
    }

    public ArticleResponse editArticle(Long articleId, String content){
        return articleRepository.findById(articleId)
                .filter(Article::isActive)
                .map(article -> {
                    article.setContent(content);
                    return article;
                })
                .map(ArticleResponse::from)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 게시글입니다."));
    }
    //article crud
    public Article createArticle(Article article){
        return articleRepository.save(article);
    }

    public ArticleResponse deleteArticle(Long articleId) {
        return articleRepository.findById(articleId)
                .filter(Article::isActive)
                .map(article -> {
                    article.setArticleStatus(ArticleStatus.DELETE);
                    return article;
                })
                .map(ArticleResponse::from)
                .orElseThrow(() -> new RuntimeException("존재하지 않는 게시글입니다."));
    }

//    public List<Article> findAll() {
//        return articleRepository.findAll();
//    }

//    public Article getArticle(Long id) {
//        return articleRepository.findById(id).orElse(null);
//    }
}
