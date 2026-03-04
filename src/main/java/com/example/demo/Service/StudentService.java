package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.entity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;


    public Student createStudent(Student student) {
        student.setStatus("PENDING");
       
        return repo.save(student);
    }


    public List<Student> getAll() {
        return repo.findAll();
    }


    public Student updateStatus(String rollNumber, String status) {

        Student student = repo.findById(rollNumber).orElseThrow();

        student.setStatus(status);

        return repo.save(student);
    }


    public Optional<Student> getById(String rollNumber){
        return repo.findById(rollNumber);
    }
}