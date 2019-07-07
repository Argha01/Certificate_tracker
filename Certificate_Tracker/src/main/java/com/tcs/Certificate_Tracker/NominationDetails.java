package com.tcs.Certificate_Tracker;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Nomination_Details")
public class NominationDetails {

	@Id
	@GeneratedValue
	private Integer nomination_id;
	private String certification_name;
	private String certification_type;
	private Integer fees;
	private String justification_desc;
	private String program_name;
	private String program_type;
	private Integer supervisor_id;
	private long contact_no;
	private String nomination_status;
	private String submit_time;
	private String last_update_time;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee  emp;
	
	@ManyToOne
	@JoinColumn(name="certification_id")
	private CertificationCatalog  certcatlog;
	
	@OneToOne
	@JoinColumn(name="quarter_no")
	private BudgetDetails bgdet;
	
	public BudgetDetails getBgdet() {
		return bgdet;
	}
	public void setBgdet(BudgetDetails bgdet) {
		this.bgdet = bgdet;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Integer getNomination_id() {
		return nomination_id;
	}
	public void setNomination_id(Integer nomination_id) {
		this.nomination_id = nomination_id;
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
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
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
	public Integer getSupervisor_id() {
		return supervisor_id;
	}
	public void setSupervisor_id(Integer supervisor_id) {
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
	public String getSubmit_time() {
		return submit_time;
	}
	public void setSubmit_time(String submit_time) {
		this.submit_time = submit_time;
	}
	public String getLast_update_time() {
		return last_update_time;
	}
	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}
	public CertificationCatalog getCertcatlog() {
		return certcatlog;
	}
	public void setCertcatlog(CertificationCatalog certcatlog) {
		this.certcatlog = certcatlog;
	}
	@Override
	public String toString() {
		return "NominationDetails [nomination_id=" + nomination_id + ", certification_name=" + certification_name
				+ ", certification_type=" + certification_type + ", fees=" + fees + ", justification_desc="
				+ justification_desc + ", program_name=" + program_name + ", program_type=" + program_type
				+ ", supervisor_id=" + supervisor_id + ", contact_no=" + contact_no + ", nomination_status="
				+ nomination_status + ", submit_time=" + submit_time + ", last_update_time=" + last_update_time
				+ ", emp=" + emp + ", certcatlog=" + certcatlog + ", bgdet=" + bgdet + "]";
	}

}
