package com.example.project10th.models.response;

import com.example.project10th.exception.ErrorCode;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter @Setter
@AllArgsConstructor
public class ApiResponse<T> {
    private Status status;
    private Metadata metadata;
    private List<T> results;
    private Object data;

    public ApiResponse(List<T> results) {
        this.status = new Status(ErrorCode.OK.getCode(), ErrorCode.OK.getMessage());
        this.metadata = new Metadata(results.size());
        this.results = results;
    }

    public ApiResponse(int code, String message){
        this.status = new Status(code, message);
        this.metadata = new Metadata(results.size());
    }

    public ApiResponse(int code, String message, Object data) {
        this.status = new Status(code, message);
        this.data = data;
    }
}
