package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Students;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StudentControler {

    @Autowired
    private StudentService service;

   
    @PostMapping("/create")
    public Students saveStudent(@RequestBody Students student) {
        return service.createStudent(student);
    }


}
