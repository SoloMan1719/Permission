package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;

@RestController
@RequestMapping("/hod")
@CrossOrigin("*")
public class HodController {

    @Autowired
    private StudentService service;

    @PutMapping("/approve/{rollNumber}")
    public Student approve(@PathVariable String rollNumber){
        return service.updateStatus(rollNumber, "APPROVED");
    }

    @PutMapping("/reject/{rollNumber}")
    public Student reject(@PathVariable String rollNumber){
        return service.updateStatus(rollNumber, "REJECTED");
    }
    @GetMapping("/all")
    public List<Student> viewAllRequests(){
        return service.getAll();
    }
}