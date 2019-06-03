package com.tcs.Certificate_Tracker;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Login_details implements Serializable{
	
	private static final long serialVersionUID =1L;
	private String password;
	private String role;
	
	@Id
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id")
	private Employee  emp;
	

	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}
