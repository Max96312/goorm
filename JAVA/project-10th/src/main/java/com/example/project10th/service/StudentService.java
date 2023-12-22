package com.example.project10th.service;

import com.example.project10th.domain.Student;
import com.example.project10th.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StudentService{

    private final StudentRepository studentRepo;
    public Student createStudent(String name, int grade){
        Student student = new Student(name, grade);
        studentRepo.create(student);
        return student;
    }

    public List<Student> findAll(){
        return  studentRepo.findAll();
    }

    public List<Student> get(int grade) {
        return studentRepo.get(grade);
    }
}