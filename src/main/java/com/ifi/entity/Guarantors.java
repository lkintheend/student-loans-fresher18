package com.ifi.entity;
// Generated Sep 27, 2018 11:38:39 AM by Hibernate Tools 5.2.11.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Guarantors generated by hbm2java
 */
@Entity
@Table(name = "guarantors", catalog = "student_loans")
public class Guarantors implements java.io.Serializable {

	private Integer guarantorId;
	private Addresses addresses;
	private String guarantorName;
	private String guarantorEmail;
	private String guarantorPhone;
	private String otherGuarantorDetails;
	private Set<StudentLoans> studentLoanses = new HashSet<StudentLoans>(0);

	public Guarantors() {
	}

	public Guarantors(Addresses addresses, String guarantorName, String guarantorEmail, String guarantorPhone,
			String otherGuarantorDetails, Set<StudentLoans> studentLoanses) {
		this.addresses = addresses;
		this.guarantorName = guarantorName;
		this.guarantorEmail = guarantorEmail;
		this.guarantorPhone = guarantorPhone;
		this.otherGuarantorDetails = otherGuarantorDetails;
		this.studentLoanses = studentLoanses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "guarantor_id", unique = true, nullable = false)
	public Integer getGuarantorId() {
		return this.guarantorId;
	}

	public void setGuarantorId(Integer guarantorId) {
		this.guarantorId = guarantorId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	public Addresses getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	@Column(name = "guarantor_name")
	public String getGuarantorName() {
		return this.guarantorName;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

	@Column(name = "guarantor_email")
	public String getGuarantorEmail() {
		return this.guarantorEmail;
	}

	public void setGuarantorEmail(String guarantorEmail) {
		this.guarantorEmail = guarantorEmail;
	}

	@Column(name = "guarantor_phone")
	public String getGuarantorPhone() {
		return this.guarantorPhone;
	}

	public void setGuarantorPhone(String guarantorPhone) {
		this.guarantorPhone = guarantorPhone;
	}

	@Column(name = "other_guarantor_details")
	public String getOtherGuarantorDetails() {
		return this.otherGuarantorDetails;
	}

	public void setOtherGuarantorDetails(String otherGuarantorDetails) {
		this.otherGuarantorDetails = otherGuarantorDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "guarantors")
	public Set<StudentLoans> getStudentLoanses() {
		return this.studentLoanses;
	}

	public void setStudentLoanses(Set<StudentLoans> studentLoanses) {
		this.studentLoanses = studentLoanses;
	}

}