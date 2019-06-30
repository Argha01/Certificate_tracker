package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.Certificate_Tracker.LoginDetails;

public interface LoginRepo extends CrudRepository<LoginDetails,Integer>{

}
