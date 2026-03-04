package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;

@RestController
@RequestMapping("/principal")
@CrossOrigin("*")
public class PrincipalController {

    @Autowired
    private StudentService service;

    @GetMapping("/all")
    public List<Student> viewAllRequests(){
        return service.getAll();
    }
}