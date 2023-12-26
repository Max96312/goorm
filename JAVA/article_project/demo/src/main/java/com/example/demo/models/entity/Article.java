package com.example.demo.models.entity;

import com.example.demo.models.ArticleStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DialectOverride;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue
    @Getter
    private Long articleId;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String content;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private ArticleStatus articleStatus;

    public boolean isActive(){
        return ArticleStatus.ACTIVE == this.articleStatus;    }

    @Getter @Setter
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    @Where(clause = "comment_status = 'ACTIVE'")
    private List<Comment> comments = new ArrayList<>();
}
