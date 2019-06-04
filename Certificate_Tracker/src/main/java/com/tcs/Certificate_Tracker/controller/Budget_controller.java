package com.tcs.Certificate_Tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Certificate_Tracker.Budget_Details;
import com.tcs.Certificate_Tracker.Employee;
import com.tcs.Certificate_Tracker.repo.Budget_repo;
import com.tcs.Certificate_Tracker.repo.Employee_Repo;


	@RestController
	@RequestMapping("/api/certificat_tracker/budget")
	public class Budget_controller {

		@Autowired
	    private Budget_repo budgetRepository;
		
		
		@GetMapping
	    public Iterable findAll() {
	        return budgetRepository.findAll();
	    }
	 
		
		@PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Budget_Details create(@RequestBody Budget_Details budget) {
	        return budgetRepository.save(budget);
	    }

}
