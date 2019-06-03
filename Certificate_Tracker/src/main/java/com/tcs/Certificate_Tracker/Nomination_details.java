package com.tcs.Certificate_Tracker;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
public class Nomination_details {

	@Id
	private long nomination_id;
	//private int employee_id;
	private String quarter_no;
	private String certification_name;
	private String certification_type;
	private long fees;
	private String justification_desc;
	private String program_name;
	private String program_type;
	private long supervisor_id;
	private long contact_no;
	private String nomination_status;
	private Timestamp submit_time;
	private Timestamp last_update_time;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="employee_id")
	private Employee  emp;
	
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public long getNomination_id() {
		return nomination_id;
	}
	public void setNomination_id(long nomination_id) {
		this.nomination_id = nomination_id;
	}
	
	public String getQuarter_no() {
		return quarter_no;
	}
	public void setQuarter_no(String quarter_no) {
		this.quarter_no = quarter_no;
	}
	public String getCertification_name() {
		return certification_name;
	}
	public void setCertification_name(String certification_name) {
		this.certification_name = certification_name;
	}
	public String getCertification_type() {
		return certification_type;
	}
	public void setCertification_type(String certification_type) {
		this.certification_type = certification_type;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public String getJustification_desc() {
		return justification_desc;
	}
	public void setJustification_desc(String justification_desc) {
		this.justification_desc = justification_desc;
	}
	public String getProgram_name() {
		return program_name;
	}
	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	public String getProgram_type() {
		return program_type;
	}
	public void setProgram_type(String program_type) {
		this.program_type = program_type;
	}
	public long getSupervisor_id() {
		return supervisor_id;
	}
	public void setSupervisor_id(long supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getNomination_status() {
		return nomination_status;
	}
	public void setNomination_status(String nomination_status) {
		this.nomination_status = nomination_status;
	}
	public Timestamp getSubmit_time() {
		return submit_time;
	}
	public void setSubmit_time(Timestamp submit_time) {
		this.submit_time = submit_time;
	}
	public Timestamp getLast_update_time() {
		return last_update_time;
	}
	public void setLast_update_time(Timestamp last_update_time) {
		this.last_update_time = last_update_time;
	}
}
