package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentsService;
import com.example.demo.entity.Students;

@RestController
@RequestMapping("/principal")
@CrossOrigin("*")
public class PrincipalController {

    @Autowired
    private StudentsService service;

    @GetMapping("/all")
    public List<Students> viewAllRequests(){
        return service.getAll();
    }
}
