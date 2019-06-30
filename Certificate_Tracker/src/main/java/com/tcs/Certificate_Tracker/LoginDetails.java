package com.tcs.Certificate_Tracker;

import javax.persistence.*;

@Entity
@Table(name="Login_Details")
public class LoginDetails{
	
	@Id	
	private Integer  employee_id;
	private String password;
	private String role;
	
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
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
