package com.example.project10th.controller;

import com.example.project10th.domain.Student;
import com.example.project10th.exception.CustomException;
import com.example.project10th.exception.ErrorCode;
import com.example.project10th.exception.InputRestriction;
import com.example.project10th.models.response.ApiResponse;
import com.example.project10th.service.StudentService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Slf4j
@RequestMapping("/student")
@RestController
@RequiredArgsConstructor
public class ApiController {

    private final StudentService studentService;

    @PostMapping("/create")
    public ApiResponse<Student> create(@RequestParam("name") String name,
                                       @RequestParam("grade") int grade) {
        if(grade > 5){
            throw new CustomException(ErrorCode.BAD_REQUEST, "grade 는 6 이상을 입력 할 수 없습니다.", new InputRestriction(6));
        }

        Student student = studentService.createStudent(name, grade);
        log.info("student={}", student);

        return makeResponse(student);
    }

    @PostMapping
    public ApiResponse<Student> get(@RequestParam("grade") int grade){
        List<Student> students = studentService.get(grade);
        log.info("students={}", students);

        return makeResponse(students);
    }

    @PostMapping("/findAll")
    public ApiResponse<Student> findAll(){
        List<Student> students = studentService.findAll();
        log.info("students={}", students);

        return makeResponse(students);
    }

    public <T> ApiResponse<T> makeResponse(T result){
        return makeResponse(Collections.singletonList(result));
    }

    public <T> ApiResponse<T> makeResponse(List<T> results){
        return new ApiResponse<>(results);
    }

    @ExceptionHandler(CustomException.class)
    public <T> ApiResponse<T> customExceptionHandler(HttpServletResponse response,
                                                     CustomException exception){
        response.setStatus(exception.getErrorCode().getHttpStatus().value());

        return new ApiResponse<>(exception.getErrorCode().getCode(), exception.getMessage(), exception.getData());
    }
}
