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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Students generated by hbm2java
 */
@Entity
@Table(name = "students", catalog = "student_loans")
public class Students implements java.io.Serializable {

	private Integer studentId;
	private String studentName;
	private Integer studentPhone;
	private String studentEmail;
	private String otherStudentDetails;
	private StudentAddresses studentAddresses;
	private Set<StudentLoans> studentLoanses = new HashSet<StudentLoans>(0);
	private Set<ActualPayments> actualPaymentses = new HashSet<ActualPayments>(0);
	private Set<Accounts> accountses = new HashSet<Accounts>(0);
	private Set<PlannedPayments> plannedPaymentses = new HashSet<PlannedPayments>(0);

	public Students() {
	}

	public Students(String studentName, Integer studentPhone, String studentEmail, String otherStudentDetails,
			StudentAddresses studentAddresses, Set<StudentLoans> studentLoanses, Set<ActualPayments> actualPaymentses,
			Set<Accounts> accountses, Set<PlannedPayments> plannedPaymentses) {
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
		this.otherStudentDetails = otherStudentDetails;
		this.studentAddresses = studentAddresses;
		this.studentLoanses = studentLoanses;
		this.actualPaymentses = actualPaymentses;
		this.accountses = accountses;
		this.plannedPaymentses = plannedPaymentses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "student_id", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@Column(name = "student_name", length = 225)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "student_phone")
	public Integer getStudentPhone() {
		return this.studentPhone;
	}

	public void setStudentPhone(Integer studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Column(name = "student_email")
	public String getStudentEmail() {
		return this.studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Column(name = "other_student_details")
	public String getOtherStudentDetails() {
		return this.otherStudentDetails;
	}

	public void setOtherStudentDetails(String otherStudentDetails) {
		this.otherStudentDetails = otherStudentDetails;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "students")
	public StudentAddresses getStudentAddresses() {
		return this.studentAddresses;
	}

	public void setStudentAddresses(StudentAddresses studentAddresses) {
		this.studentAddresses = studentAddresses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	public Set<StudentLoans> getStudentLoanses() {
		return this.studentLoanses;
	}

	public void setStudentLoanses(Set<StudentLoans> studentLoanses) {
		this.studentLoanses = studentLoanses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	public Set<ActualPayments> getActualPaymentses() {
		return this.actualPaymentses;
	}

	public void setActualPaymentses(Set<ActualPayments> actualPaymentses) {
		this.actualPaymentses = actualPaymentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	public Set<Accounts> getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set<Accounts> accountses) {
		this.accountses = accountses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	public Set<PlannedPayments> getPlannedPaymentses() {
		return this.plannedPaymentses;
	}

	public void setPlannedPaymentses(Set<PlannedPayments> plannedPaymentses) {
		this.plannedPaymentses = plannedPaymentses;
	}

}
