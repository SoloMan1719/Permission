package com.example.demo.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

	Optional<Student> findById(String rollNumber);

	

 

}    
