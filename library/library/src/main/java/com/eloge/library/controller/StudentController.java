package com.eloge.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eloge.library.model.Student;
import com.eloge.library.repository.StudentRepository;

@RestController
public class StudentController {

    // this is in depency injection to help for get eand setter
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add_student")
    public Student add_student(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/all_student")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
