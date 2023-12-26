package com.example.demo.controller;

import com.example.demo.models.request.ArticleDeleteRequest;
import com.example.demo.models.request.ArticleEditRequest;
import com.example.demo.models.request.ArticleRequest;
import com.example.demo.models.response.ArticleResponse;
import com.example.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ArticleController {

    /*
     * Soft Delete -> MySQL Bin Log
     * Page, Pageable
     *
     * No property 'price' found for type 'NoticeMember'
     * ArticleStatus status; : modified articleStatus -> no property
     *
     * @Transactional -> save() x
     *
     * @NoArgsConstructor -> object is setter
     *
     * @Builder
     *
     *
     *
     * 댓글 수정
     * 댓글 삭제
     * */
    private final ArticleService articleService;

    @GetMapping("/article/create")
    public String newArticle(){
        return "test";
    }

//    @PostMapping("/article/create")
//    public Article createArticle(@RequestBody  ArticleRequest articleRequest){
//        Article articleEntity = articleRequest.toEntity();
//        log.info("articleEntity={}", articleEntity);
//
//        return articleService.createArticle(articleEntity);
//    }

    @PostMapping("/article")
    public ArticleResponse writerArticle(@RequestBody ArticleRequest articleRequest){
        return articleService.writeArticle(articleRequest.getTitle(), articleRequest.getContent());
    }

    @GetMapping("/article")
    public ArticleResponse searchArticle(@RequestParam("articleId") Long articleId){
        return articleService.getArticle(articleId);
    }

//    @GetMapping("/article/{id}")
//    public Article get(@PathVariable Long id){
//        return articleService.getArticle(id);
//    }

  @GetMapping("/articles")
  public List<ArticleResponse> searchArticleList(@RequestParam("page") int page,
                                                 @RequestParam("pageSize") int pageSize){
      return articleService.searchArticleList(page, pageSize);
  }

  @PutMapping("/article")
    public ArticleResponse editArticle(@RequestBody ArticleEditRequest articleEditRequest){
      return articleService.editArticle(articleEditRequest.getArticleId(), articleEditRequest.getContent());
  }

    @DeleteMapping("/article")
    public ArticleResponse deleteArticle(@RequestBody ArticleDeleteRequest articleDeleteRequest){
        return articleService.deleteArticle(articleDeleteRequest.getArticleId());
    }

//  QueryDSL ArticleList -> cursor page

//    @GetMapping("/articles")
//    public List<Article> getAll(){
//        return articleService.findAll();
//    }
}