package com.example.project10th.service;

import com.example.project10th.models.entity.Student;
import com.example.project10th.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getStudentsByGrade(int grade) {
        return studentRepository.findByGradeOrderByGradeAsc(grade);
    }
}
