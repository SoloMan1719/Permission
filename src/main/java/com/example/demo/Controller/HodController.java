package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service.StudentsService;
import com.example.demo.entity.Students;

@RestController
@RequestMapping("/hod")
@CrossOrigin("*")
public class HodController {

    @Autowired
    private StudentsService service;

    @PutMapping("/approve/{rollNumber}")
    public Students approve(@PathVariable String rollNumber){
        return service.updateStatus(rollNumber, "APPROVED");
    }

    @PutMapping("/reject/{rollNumber}")
    public Students reject(@PathVariable String rollNumber){
        return service.updateStatus(rollNumber, "REJECTED");
    }
    @GetMapping("/all")
    public List<Students> viewAllRequests(){
        return service.getAll();
    }
}
