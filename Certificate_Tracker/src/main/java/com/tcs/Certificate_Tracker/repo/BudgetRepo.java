package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Certificate_Tracker.*;

public interface BudgetRepo extends JpaRepository<BudgetDetails,Integer>{ 

}
