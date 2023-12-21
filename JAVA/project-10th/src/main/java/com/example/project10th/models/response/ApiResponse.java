package com.example.project10th.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    Status status;
    Metadata metadata;
    List<T> results;
}