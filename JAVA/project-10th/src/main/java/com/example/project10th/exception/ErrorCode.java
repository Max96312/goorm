package com.example.project10th.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    OK(200, HttpStatus.OK, "OK"),
    BAD_REQUEST(400, HttpStatus.BAD_REQUEST, "잘못된 요청입니다.");

    private final int code;
    private final HttpStatus httpStatus;
    private final String message;
}

