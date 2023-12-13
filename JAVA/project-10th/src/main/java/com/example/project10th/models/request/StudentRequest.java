package com.example.project10th.models.request;

import com.example.project10th.models.entity.Student;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class StudentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int grade;

    public Student toEntity() {
        return new Student(id, name, grade);
    }
}
