package com.tcs.Certificate_Tracker.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.Certificate_Tracker.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
	

}
