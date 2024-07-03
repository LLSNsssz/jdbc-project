package com.example.mybatis.controller;

import com.example.mybatis.domain.Students;
import com.example.mybatis.sevice.StudentService;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudent();
    }

    @GetMapping("/students")
    public List<Students> getAllStudents(@RequestParam(required = false) Long id) {
        return studentService.getStudents(id);
    }

    @PostMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addStudents(@RequestBody Students students) {
        //INSERT
        studentService.saveStudents(students);
        return "OK";
    }
}
