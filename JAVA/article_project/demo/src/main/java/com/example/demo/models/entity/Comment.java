package com.example.demo.models.entity;

import com.example.demo.models.CommentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long commentId;

    @Getter @Setter
    private String content;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    private CommentStatus commentStatus;

    public boolean isActive(){
        return this.commentStatus == CommentStatus.ACTIVE;
    }

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;
}
