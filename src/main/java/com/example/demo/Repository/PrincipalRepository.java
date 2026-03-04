package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Principal;

public interface PrincipalRepository extends JpaRepository<Principal,Long> {  

}
