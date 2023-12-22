package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.models.request.ArticleRequest;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ArticleController {
//    댓글 도메인 작성 (대댓글 고려 x)

    /*
     * 게시글 삭제(단건) -> 댓글 삭제 (jpa soft delete)
     * 게시글 수정(단건) -> 삭제된 게시글은 수정 불가. (예외 처리)
     * 게시글 리스트 조회 -> 응답은 제목, 페이징 기능(offset, cursor) 최신순 정렬
     * 게시글 단 건 조회
     *
     * 댓글 등록
     * 댓글 수정
     * 댓글 삭제
     * */
    private final ArticleService articleService;

    @GetMapping("/article/create")
    public String newArticle(){
        return "test";
    }

    @PostMapping("/article/create")
    public Article createArticle(ArticleRequest articleRequest){
        Article articleEntity = articleRequest.toEntity();
        log.info("articleEntity={}", articleEntity);

        return articleService.createArticle(articleEntity);
    }

    @GetMapping("/article/{id}")
    public Article get(@PathVariable Long id){
        return articleService.getArticle(id);
    }

    @GetMapping("/articles")
    public List<Article> getAll(){
        return articleService.findAll();
    }
}
