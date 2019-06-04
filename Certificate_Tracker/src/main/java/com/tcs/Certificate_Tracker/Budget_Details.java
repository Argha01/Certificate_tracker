package com.tcs.Certificate_Tracker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Budget_Details")
public class Budget_Details {
	@Id
	private int quarter_no;
	private int total_budget;
	private int nomination_budget;
	private int actual_budget;
	private int under_utilized_budget;
	
	public int getQuarter_no() {
		return quarter_no;
	}
	public void setQuarter_no(int quarter_no) {
		this.quarter_no = quarter_no;
	}
	public int getTotal_budget() {
		return total_budget;
	}
	public void setTotal_budget(int total_budget) {
		this.total_budget = total_budget;
	}
	public int getNomination_budget() {
		return nomination_budget;
	}
	public void setNomination_budget(int nomination_budget) {
		this.nomination_budget = nomination_budget;
	}
	public int getActual_budget() {
		return actual_budget;
	}
	public void setActual_budget(int actual_budget) {
		this.actual_budget = actual_budget;
	}
	public int getUnder_utilized_budget() {
		return under_utilized_budget;
	}
	public void setUnder_utilized_budget(int under_utilized_budget) {
		this.under_utilized_budget = under_utilized_budget;
	}
	
}
