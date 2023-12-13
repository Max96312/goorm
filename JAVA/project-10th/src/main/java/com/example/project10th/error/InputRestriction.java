package com.example.project10th.error;

import lombok.Data;

@Data
public class InputRestriction {
    private int maxGrade;

    public InputRestriction(int maxGrade) {
        this.maxGrade = maxGrade;
    }
}
