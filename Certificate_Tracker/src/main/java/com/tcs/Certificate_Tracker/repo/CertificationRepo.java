package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tcs.Certificate_Tracker.CertificationCatalog;

public interface CertificationRepo extends JpaRepository<CertificationCatalog,Integer> {
	

}

