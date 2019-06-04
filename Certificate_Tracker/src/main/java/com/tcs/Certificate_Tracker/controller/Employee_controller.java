package com.tcs.Certificate_Tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tcs.Certificate_Tracker.Employee;
import com.tcs.Certificate_Tracker.repo.Employee_Repo;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/certificat_tracker/employee")
public class Employee_controller {

	@Autowired
    private Employee_Repo empRepository;
	
	
	@GetMapping
    public Iterable findAll() {
        return empRepository.findAll();
    }
 
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee emp) {
        return empRepository.save(emp);
    }
	
}
