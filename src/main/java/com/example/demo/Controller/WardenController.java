package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentsService;
import com.example.demo.entity.Students;

@RestController
@RequestMapping("/warden")
@CrossOrigin("*")
public class WardenController {

    @Autowired
    private StudentsService service;

    @GetMapping("/all")
    public List<Students> getAllRequests(){
        return service.getAll();
    }
}
