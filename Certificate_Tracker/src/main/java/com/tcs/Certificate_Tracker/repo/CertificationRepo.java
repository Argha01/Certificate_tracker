package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.Certificate_Tracker.CertificationCatalog;

public interface CertificationRepo extends CrudRepository<CertificationCatalog,Integer> {
	

}

