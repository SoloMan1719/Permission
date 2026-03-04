package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Principal {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String RollNumber;
private String Subject;
private String Branch;
private LocalDate fromDate;
private LocalDate toDate;
private String status;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNumber() {
	return RollNumber;
}
public void setRollNumber(String rollNumber) {
	RollNumber = rollNumber;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}
public String getBranch() {
	return Branch;
}
public void setBranch(String branch) {
	Branch = branch;
}
public LocalDate getFromDate() {
	return fromDate;
}
public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
}
public LocalDate getToDate() {
	return toDate;
}
public void setToDate(LocalDate toDate) {
	this.toDate = toDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

	

}
