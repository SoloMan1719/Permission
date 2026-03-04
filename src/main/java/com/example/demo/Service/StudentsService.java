package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentsRepository;
import com.example.demo.entity.Students;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository repo;


    public Students createStudent(Students student) {
        student.setStatus("PENDING");
       
        return repo.save(student);
    }


    public List<Students> getAll() {
        return repo.findAll();
    }


    public Students updateStatus(String rollNumber, String status) {

        Students student = repo.findById(rollNumber).orElseThrow();

        student.setStatus(status);

        return repo.save(student);
    }


    public Optional<Students> getById(String rollNumber){
        return repo.findById(rollNumber);
    }
}
