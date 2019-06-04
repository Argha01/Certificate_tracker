package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.Certificate_Tracker.Certification_Catalog;

public interface Certification_repo extends CrudRepository<Certification_Catalog,Integer> {
	

}

