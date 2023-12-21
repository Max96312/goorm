package com.example.project10th.repository;

import com.example.project10th.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {
    Set<Student> students = new HashSet<>();

    public void create(Student student){
        students.add(student);
    }

    public List<Student> getAll(){
        return new ArrayList<>(students);
    }

    public List<Student> get(int grade){
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }
}
