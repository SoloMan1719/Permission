package com.example.demo.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, String>{

	Optional<Student> findById(String rollNumber);

	

 

}    
