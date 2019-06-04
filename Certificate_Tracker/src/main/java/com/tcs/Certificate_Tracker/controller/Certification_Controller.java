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
import com.tcs.Certificate_Tracker.Certification_Catalog;
import com.tcs.Certificate_Tracker.repo.Budget_repo;
import com.tcs.Certificate_Tracker.repo.Certification_repo;


	@RestController
	@RequestMapping("/api/certificat_tracke/certificater")
	public class Certification_Controller {

		@Autowired
	    private Certification_repo certificatrepository;
		
		
		@GetMapping
	    public Iterable findAll() {
	        return certificatrepository.findAll();
	    }
	 
		
		@PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Certification_Catalog create(@RequestBody Certification_Catalog certificate) {
	        return certificatrepository.save(certificate);
	    }

}
