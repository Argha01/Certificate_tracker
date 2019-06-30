package com.tcs.Certificate_Tracker;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name="Certification_Catalog")
public class CertificationCatalog {
	
	@Id
	private int certification_id;
	private String certification_name;
	private String description;
	private String available_from_date;
	private String discontinued_date;
	private String category;
	private String focus_area;
	private String sub_focus_area;
	private String status;
	private String type;
	private String validity_period;
	private String vendor_name;
	private int exam_id;
	private String exam_name;
	private String reimbursable;
	private String recertification_start_date;
	private int competency_id;
	private String competency_name;
	private String competency_proficiency_level;
	private int prerequisite_id;
	private String prerequisite_name;
	private String prerequisite_type;
	private String certification_as_pre_requisite;
	private int reference_certification_id;
	private String reference_certification_name;
	private String reference_certification_type;
	
	
	public int getCertification_id() {
		return certification_id;
	}
	public void setCertification_id(int certification_id) {
		this.certification_id = certification_id;
	}
	public String getCertification_name() {
		return certification_name;
	}
	public void setCertification_name(String certification_name) {
		this.certification_name = certification_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailable_from_date() {
		return available_from_date;
	}
	public void setAvailable_from_date(String available_from_date) {
		this.available_from_date = available_from_date;
	}
	public String getDiscontinued_date() {
		return discontinued_date;
	}
	public void setDiscontinued_date(String discontinued_date) {
		this.discontinued_date = discontinued_date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFocus_area() {
		return focus_area;
	}
	public void setFocus_area(String focus_area) {
		this.focus_area = focus_area;
	}
	public String getSub_focus_area() {
		return sub_focus_area;
	}
	public void setSub_focus_area(String sub_focus_area) {
		this.sub_focus_area = sub_focus_area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValidity_period() {
		return validity_period;
	}
	public void setValidity_period(String validity_period) {
		this.validity_period = validity_period;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	public String getReimbursable() {
		return reimbursable;
	}
	public void setReimbursable(String reimbursable) {
		this.reimbursable = reimbursable;
	}
	public String getRecertification_start_date() {
		return recertification_start_date;
	}
	public void setRecertification_start_date(String recertification_start_date) {
		this.recertification_start_date = recertification_start_date;
	}
	public int getCompetency_id() {
		return competency_id;
	}
	public void setCompetency_id(int competency_id) {
		this.competency_id = competency_id;
	}
	public String getCompetency_name() {
		return competency_name;
	}
	public void setCompetency_name(String competency_name) {
		this.competency_name = competency_name;
	}
	public String getCompetency_proficiency_level() {
		return competency_proficiency_level;
	}
	public void setCompetency_proficiency_level(String competency_proficiency_level) {
		this.competency_proficiency_level = competency_proficiency_level;
	}
	public int getPrerequisite_id() {
		return prerequisite_id;
	}
	public void setPrerequisite_id(int prerequisite_id) {
		this.prerequisite_id = prerequisite_id;
	}
	public String getPrerequisite_name() {
		return prerequisite_name;
	}
	public void setPrerequisite_name(String prerequisite_name) {
		this.prerequisite_name = prerequisite_name;
	}
	public String getPrerequisite_type() {
		return prerequisite_type;
	}
	public void setPrerequisite_type(String prerequisite_type) {
		this.prerequisite_type = prerequisite_type;
	}
	public String getCertification_as_pre_requisite() {
		return certification_as_pre_requisite;
	}
	public void setCertification_as_pre_requisite(
			String certification_as_pre_requisite) {
		this.certification_as_pre_requisite = certification_as_pre_requisite;
	}
	public int getReference_certification_id() {
		return reference_certification_id;
	}
	public void setReference_certification_id(int reference_certification_id) {
		this.reference_certification_id = reference_certification_id;
	}
	public String getReference_certification_name() {
		return reference_certification_name;
	}
	public void setReference_certification_name(String reference_certification_name) {
		this.reference_certification_name = reference_certification_name;
	}
	public String getReference_certification_type() {
		return reference_certification_type;
	}
	public void setReference_certification_type(String reference_certification_type) {
		this.reference_certification_type = reference_certification_type;
	}
	
	
	
	
	
	
	
	
	
	

}
