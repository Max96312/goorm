package com.example.project10th.controller;

import com.example.project10th.error.InputRestriction;
import com.example.project10th.models.request.StudentRequest;
import com.example.project10th.models.response.Metadata;
import com.example.project10th.models.response.Status;
import com.example.project10th.models.entity.Student;
import com.example.project10th.error.ErrorCode;
import com.example.project10th.error.CustomException;
import com.example.project10th.models.response.ApiResponse;
import com.example.project10th.service.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class ApiController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ApiResponse<Student> createStudent(@RequestBody StudentRequest studentRequest) {
        try {
            if (studentRequest.getGrade() > 6) {
                throw new CustomException(ErrorCode.INVALID_GRADE, "grade는 6이상을 입력 할 수 없습니다.", new InputRestriction(6));
            }
            Student studentEntity = studentRequest.toEntity();
            return makeResponse(studentEntity);
        } catch (CustomException e) {
            return handleException(e);
        }
    }

    @GetMapping("/grades")
    public ApiResponse<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
            return makeResponse(students);
    }

    @GetMapping("/grades/{grade}")
    public ApiResponse<Student> getStudentsByGrade(@PathVariable int grade) {
        List<Student> students = studentService.getStudentsByGrade(grade);
        return makeResponse(students);
    }

    private ApiResponse<Student> makeResponse(Student student) {
        ApiResponse<Student> response = new ApiResponse<>();
        response.setStatus(new Status(2000, "OK"));
        response.setMetadata(new Metadata(1));
        List<Student> results = new ArrayList<>();
        results.add(student);
        response.setResults(results);
        return response;
    }
    Stream
    private ApiResponse<Student> makeResponse(List<Student> students) {
        ApiResponse<Student> response = new ApiResponse<>();
        response.setStatus(new Status(2000, "OK"));
        response.setMetadata(new Metadata(students.size()));
        response.setResults(students);
        return response;
    }

    private ApiResponse<Student> handleException(CustomException e) {
        return new ApiResponse<>(
                new Status(e.getErrorCode().ordinal(), e.getMessage()),
                new Metadata(),
                null
        );
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ApiResponse<Student> customExceptionHandler(HttpServletResponse response, CustomException e) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ApiResponse<>(new Status(e.getErrorCode().ordinal(), e.getMessage()), new Metadata(), null);
    }

}
