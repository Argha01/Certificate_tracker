package com.tcs.Certificate_Tracker;

import javax.persistence.*;

@Entity
@Table(name="Employee_Details")
public class Employee {
	@Id
	private Integer employee_id;
	private String m_id;
	private String employee_name;
	private String email_id;
	private char activity_flag;
	private String branch_name;
	private String department_name;
	
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public char getActivity_flag() {
		return activity_flag;
	}
	public void setActivity_flag(char activity_flag) {
		this.activity_flag = activity_flag;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	

}
