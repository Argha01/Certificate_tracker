package com.tcs.Certificate_Tracker;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ActivityDetails implements Serializable {
	
	
	private NominationDetails nom;
	private Integer failurecode;
	private String failuremessage;
	public NominationDetails getNom() {
		return nom;
	}
	public void setNom(NominationDetails nom) {
		this.nom = nom;
	}
	public Integer getFailurecode() {
		return failurecode;
	}
	public void setFailurecode(Integer failurecode) {
		this.failurecode = failurecode;
	}
	public String getFailuremessage() {
		return failuremessage;
	}
	public void setFailuremessage(String failuremessage) {
		this.failuremessage = failuremessage;
	}
}
