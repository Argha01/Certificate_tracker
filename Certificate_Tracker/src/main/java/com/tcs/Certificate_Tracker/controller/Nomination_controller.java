package com.tcs.Certificate_Tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Certificate_Tracker.Nomination_details;
import com.tcs.Certificate_Tracker.repo.Nomination_repo;

@RestController
@RequestMapping("/api/certificat_tracker/nomdetails")
public class Nomination_controller {
	
	@Autowired
    private Nomination_repo nominatioRepository;
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Nomination_details create(@RequestBody Nomination_details nom) {
        return nominatioRepository.save(nom);
    }

}
