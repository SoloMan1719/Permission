package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Warden;

public interface WardenRepository extends JpaRepository<Warden, Long> {

}
