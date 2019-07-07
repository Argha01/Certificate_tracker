package com.tcs.Certificate_Tracker.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.Certificate_Tracker.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	

}
