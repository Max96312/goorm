package com.example.demo.controller;

import com.example.demo.dto.ArticleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {
//    게시글 도메인 작성 (제목, 본문, <String>)
//    댓글 도메인 작성 (대댓글 고려 x)

/*
* 게시글 등록(단건)
* 게시글 삭제(단건) -> 댓글 삭제 (jpa soft delete)
* 게시글 수정(단건) -> 삭제된 게시글은 수정 불가. (예외 처리)
* 게시글 리스트 조회 -> 응답은 제목, 페이징 기능(offset, cursor) 최신순 정렬
* 게시글 단 건 조회
*
* 댓글 등록
* 댓글 수정
* 댓글 삭제
* */
    @GetMapping("/articles/new")
    public String newArticle(){
        return "";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleRequest article){
        log.info("article={}", article);
        return "";
    }
}
