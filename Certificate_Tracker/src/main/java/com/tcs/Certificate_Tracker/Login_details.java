package com.tcs.Certificate_Tracker;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Login_details implements Serializable{
	
	@Id	
	private Integer  employee_id;
	private static final long serialVersionUID =1L;
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
