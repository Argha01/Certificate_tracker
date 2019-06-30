package com.tcs.Certificate_Tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Certificate_Tracker.BudgetDetails;
import com.tcs.Certificate_Tracker.CertificationCatalog;
import com.tcs.Certificate_Tracker.Employee;
import com.tcs.Certificate_Tracker.NominationDetails;
import com.tcs.Certificate_Tracker.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainservice;
	
	@GetMapping("/api/certificat_tracker/getbudget")
    public Iterable findAllBudgetDetails() {
        return mainservice.findAllBudgetDetails();
    }
 
	
	@PostMapping("/api/certificat_tracker/createbudget")
    @ResponseStatus(HttpStatus.CREATED)
	public BudgetDetails createBudget(@RequestBody BudgetDetails budget) {
        return mainservice.create(budget);
    }

	@GetMapping("/api/certificat_tracke/getallcertificate")
    public Iterable findAllCertificate() {
        return mainservice.findAllCert();
    }
 
	@PostMapping("/api/certificat_tracke/createcertificater")
    @ResponseStatus(HttpStatus.CREATED)
    public CertificationCatalog createCertificate(@RequestBody CertificationCatalog certificate) {
        return mainservice.createCert(certificate);
    }
	
	
	
	@GetMapping("/api/certificat_tracker/getallemployee")
    public Iterable findAllEmployees() {
        return mainservice.findAllEmp();
    }
 
	
	@PostMapping("/api/certificat_tracker/createemployee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee emp) {
        return mainservice.createEmp(emp);
    }
	
	@GetMapping("/api/certificat_tracker/getallnomination")
    public Iterable findAllNomination() {
        return mainservice.findAllNominations();
    }
	
	@PostMapping("/api/certificat_tracker/createnomdetails")
    @ResponseStatus(HttpStatus.CREATED)
    public NominationDetails createNomination(@RequestBody NominationDetails nom) {
        return mainservice.createNomination(nom);
    }
	
}
