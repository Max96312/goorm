package com.example.project10th.error;

import lombok.Data;

@Data
public class CustomException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public CustomException(ErrorCode errorCode, String message, InputRestriction inputRestriction) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
