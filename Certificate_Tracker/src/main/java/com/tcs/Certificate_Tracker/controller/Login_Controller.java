package com.tcs.Certificate_Tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Certificate_Tracker.repo.Login_Repo;



@RestController
@RequestMapping("/api/certificat_tracker/login")
public class Login_Controller {

	@Autowired
    private Login_Repo loginRepository;
	
	
	@GetMapping
    public Iterable findAll() {
        return loginRepository.findAll();
    }
 
	
}


