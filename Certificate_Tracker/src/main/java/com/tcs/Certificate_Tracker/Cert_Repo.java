package com.tcs.Certificate_Tracker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cert_Repo extends CrudRepository<Employee,Integer> {
	

}
