package com.tcs.Certificate_Tracker.service;

import com.tcs.Certificate_Tracker.NominationDetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tcs.Certificate_Tracker.BudgetDetails;
import com.tcs.Certificate_Tracker.CertificationCatalog;
import com.tcs.Certificate_Tracker.Employee;
import com.tcs.Certificate_Tracker.repo.NominationRepo;
import com.tcs.Certificate_Tracker.repo.EmployeeRepo;
import com.tcs.Certificate_Tracker.repo.BudgetRepo;
import com.tcs.Certificate_Tracker.repo.CertificationRepo;

@Service
public class MainService {
	
	@Autowired
    private NominationRepo nominatioRepository;
	
	

    public NominationDetails createNomination(NominationDetails nom) {
    	System.out.println("Inside createNomination");
    	if(empRepository.existsById(nom.getEmp().getEmployee_id()) && 
    			certificatrepository.existsById(nom.getCertcatlog().getCertification_id()))
        {
    		return nominatioRepository.save(nom);
        }
    	return null;
    }
    
	@Autowired
    private BudgetRepo budgetRepository;
	
	
    public Iterable findAllBudgetDetails() {
        return budgetRepository.findAll();
    }
     public BudgetDetails create(BudgetDetails budget) {
        return budgetRepository.save(budget);
    }

 	@Autowired
    private EmployeeRepo empRepository;
	
    public Iterable findAllEmp() {
        return empRepository.findAll();
    }
    
    public Optional<Employee> findEmployee(int id)
    {
    	return empRepository.findById(id);
    }
    
	public Employee createEmp(Employee emp) {
        return empRepository.save(emp);
    }
	@Autowired
    private CertificationRepo certificatrepository;
	
	
    public Iterable findAllCert() {
        return certificatrepository.findAll();
    }
    
    public Optional<CertificationCatalog> findCertification(int id)
    {
    	return certificatrepository.findById(id);
    }
 
    public CertificationCatalog createCert(CertificationCatalog certificate) {
        return certificatrepository.save(certificate);
    }

   
    
    @Autowired
    private NominationRepo nominationrepo;
    
    public Iterable findAllNominations() {
        return nominationrepo.findAll();
    }

}
