package com.tcs.Certificate_Tracker;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Budget_Details")
public class BudgetDetails {
	@Id
	private int quarter_no;
	private long total_budget;
	private long nomination_budget;
	private long actual_budget;
	private long under_utilized_budget;
	public int getQuarter_no() {
		return quarter_no;
	}
	public void setQuarter_no(int quarter_no) {
		this.quarter_no = quarter_no;
	}
	public long getTotal_budget() {
		return total_budget;
	}
	public void setTotal_budget(long total_budget) {
		this.total_budget = total_budget;
	}
	public long getNomination_budget() {
		return nomination_budget;
	}
	public void setNomination_budget(long nomination_budget) {
		this.nomination_budget = nomination_budget;
	}
	public long getActual_budget() {
		return actual_budget;
	}
	public void setActual_budget(long actual_budget) {
		this.actual_budget = actual_budget;
	}
	public long getUnder_utilized_budget() {
		return under_utilized_budget;
	}
	public void setUnder_utilized_budget(long under_utilized_budget) {
		this.under_utilized_budget = under_utilized_budget;
	}
	
		
}
