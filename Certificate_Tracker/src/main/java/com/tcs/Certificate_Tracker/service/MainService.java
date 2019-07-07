package com.tcs.Certificate_Tracker.service;

import com.tcs.Certificate_Tracker.NominationDetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Certificate_Tracker.ActivityDetails;
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
	
	@Autowired
    private EmployeeRepo empRepository;
	
	public Object updateNomination(NominationDetails nom)
	{
		System.out.println("id  "+nom.getNomination_id());
		if(nominatioRepository.existsById(nom.getNomination_id()))
		{
			nom.setNomination_status("Approved");
			return nominatioRepository.save(nom);
		}
		else
		{
			return "-700";
		}
	}

    public Object createNomination(NominationDetails nom) 
    {
    	
    	if(nom.getEmp().getEmployee_id()==null)
    	{
    		return "-600";
    	}
    	if(nom.getSupervisor_id()==null)
    	{
    		return "-500";
    	}
    	System.out.println("certificatrepository "+certificatrepository);
    	System.out.println("empRepository "+empRepository);
    	if(empRepository.existsById(nom.getEmp().getEmployee_id()))
        {
    		if(empRepository.existsById(nom.getSupervisor_id()))
    		{
    			if(certificatrepository.existsById(nom.getCertcatlog().getCertification_id()))
    			{
    				if(nom.getFees()<=findAllBudgetDetails(nom.getBgdet().getQuarter_no()).getTotal_budget())
    				{
    					System.out.println("value of function "+nominatioRepository.findBycertification_idAndemployee_idAndquarter_no(nom.getEmp().getEmployee_id(),nom.getCertcatlog().getCertification_id(),
    							nom.getBgdet().getQuarter_no()));
    					if(nominatioRepository.findBycertification_idAndemployee_idAndquarter_no(nom.getEmp().getEmployee_id(),nom.getCertcatlog().getCertification_id(),
    							nom.getBgdet().getQuarter_no())==null)
    					{
    						nom.setNomination_status("Initiated");
    						nom.setBgdet(UpdateBudget(nom));
        					return nominatioRepository.save(nom);
    					}
    					else
    					{
    						return "-800";
    					}
    				}
    				else
    				{
    					return "-400";
    				}
    			}
    			else
    			{
    				return "-300";
    			}
    		}
    		else
    		{
    			return "-100";
    		}
        }
    	else
    	{
    		return "-200";
    	}
    }
    
	@Autowired
    private BudgetRepo budgetRepository;
	
	
    public BudgetDetails findAllBudgetDetails(int quarter_no) {
        return budgetRepository.findById(quarter_no).get();
    }
    
    public BudgetDetails UpdateBudget(NominationDetails nom) {
    	BudgetDetails budget =budgetRepository.findById(nom.getBgdet().getQuarter_no()).get();
    	if(nom.getNomination_status()=="Initiated")
    	{	
	    	budget.setNomination_budget(budget.getNomination_budget()+nom.getFees());
	    	budget.setUnder_utilized_budget(budget.getTotal_budget()-nom.getFees());
	    	return budgetRepository.save(budget);
    	}
    	else if(nom.getNomination_status()=="Approved")
    	{
    		budget.setActual_budget(nom.getFees());
    		return budgetRepository.save(budget);
    	}
    	return budget;
    	
    }
    
    public ActivityDetails Call(String activityacode,NominationDetails nom) 
    {
    	ActivityDetails act =new ActivityDetails();
    	act.setNom(null);
    	System.out.println("activityacode "+activityacode);
    	System.out.println("nominatioRepository "+nominatioRepository);
    	System.out.println("NominationDetails "+nom);
    	switch(activityacode)
    	{
			case "CreateNomination":
			{	
				Object o=createNomination(nom);
				System.out.println("value "+o);
				if(o=="-100")
				{
					act.setFailurecode(-100);
					act.setFailuremessage("Supervisor's employee id is not valid");
				}
				else if(o=="-200")
				{
					act.setFailurecode(-200);
					act.setFailuremessage("Employee id is not valid");
				}
				else if(o=="-300")
				{
					act.setFailurecode(-300);
					act.setFailuremessage("Chosen certification is not valid");
				}
				else if(o=="-400")
				{
					act.setFailurecode(-400);
					act.setFailuremessage("Chosen certification's fees should be lesser than total budget");
				}
				else if(o=="-500")
				{
					act.setFailurecode(-500);
					act.setFailuremessage("Superviser's id can not be blank");
				}
				else if(o=="-600")
				{
					act.setFailurecode(-600);
					act.setFailuremessage("Employee id can not be blank");
				}
				else if(o=="-800")
				{
					act.setFailurecode(-800);
					act.setFailuremessage("Employee has already registered for this certification");
				}
				else
				{
					act.setFailurecode(0);
					act.setFailuremessage(null);
					act.setNom((NominationDetails)o);
				}
				break;
			}
	    	case "UpdateNomination":
	    	{
	    		Object o=updateNomination(nom);
	    		if(o=="-700")
	    		{
	    			act.setFailurecode(-700);
	    			act.setFailuremessage("Nomination is not pressent");
	    		}
	    		else
	    		{
	    			act.setFailurecode(0);
					act.setFailuremessage(null);
					act.setNom((NominationDetails)o);
	    		}
	    		break;
	    	}
    	}
		return act;
    }
    

 	
    public Iterable findAllEmp() {
    	System.out.println("empRepository "+empRepository);
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
