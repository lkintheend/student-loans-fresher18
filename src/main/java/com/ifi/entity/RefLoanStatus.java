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
import javax.persistence.Table;

/**
 * RefLoanStatus generated by hbm2java
 */
@Entity
@Table(name = "ref_loan_status", catalog = "student_loans")
public class RefLoanStatus implements java.io.Serializable {

	private Integer loanStatusCode;
	private String loanStatusDescription;
	private Set<StudentLoans> studentLoanses = new HashSet<StudentLoans>(0);

	public RefLoanStatus() {
	}

	public RefLoanStatus(String loanStatusDescription, Set<StudentLoans> studentLoanses) {
		this.loanStatusDescription = loanStatusDescription;
		this.studentLoanses = studentLoanses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "loan_status_code", unique = true, nullable = false)
	public Integer getLoanStatusCode() {
		return this.loanStatusCode;
	}

	public void setLoanStatusCode(Integer loanStatusCode) {
		this.loanStatusCode = loanStatusCode;
	}

	@Column(name = "loan_status_description")
	public String getLoanStatusDescription() {
		return this.loanStatusDescription;
	}

	public void setLoanStatusDescription(String loanStatusDescription) {
		this.loanStatusDescription = loanStatusDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refLoanStatus")
	public Set<StudentLoans> getStudentLoanses() {
		return this.studentLoanses;
	}

	public void setStudentLoanses(Set<StudentLoans> studentLoanses) {
		this.studentLoanses = studentLoanses;
	}

}
