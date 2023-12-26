package com.example.demo.models.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CommentPostRequest implements Serializable {
    private Long commentId;
    private String commentContent;
}
