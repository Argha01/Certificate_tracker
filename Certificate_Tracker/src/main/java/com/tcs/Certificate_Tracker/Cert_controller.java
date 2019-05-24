package com.tcs.Certificate_Tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/certificat_tracker")
public class Cert_controller {

	@Autowired
    private Cert_Repo certRepository;
	
	
	@GetMapping
    public Iterable findAll() {
        return certRepository.findAll();
    }
 
	
	@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee emp) {
        return certRepository.save(emp);
    }
	
}
