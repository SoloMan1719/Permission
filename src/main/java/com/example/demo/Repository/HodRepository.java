package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hod;

public interface HodRepository extends JpaRepository<Hod,Long> {
  
}
