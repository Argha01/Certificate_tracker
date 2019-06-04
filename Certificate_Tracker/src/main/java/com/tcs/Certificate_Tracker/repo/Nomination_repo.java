package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.repository.CrudRepository;

import com.tcs.Certificate_Tracker.Nomination_details;

public interface Nomination_repo extends CrudRepository<Nomination_details,Integer>{

}
