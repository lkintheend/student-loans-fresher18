package com.ifi.entity;
// Generated Sep 27, 2018 11:38:39 AM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * StudentAddresses generated by hbm2java
 */
@Entity
@Table(name = "student_addresses", catalog = "student_loans")
public class StudentAddresses implements java.io.Serializable {

	private Integer studentId;
	private Addresses addresses;
	private RefAddressTypes refAddressTypes;
	private Students students;
	private Date dateFrom;
	private Date dateTo;

	public StudentAddresses() {
	}

	public StudentAddresses(Students students) {
		this.students = students;
	}

	public StudentAddresses(Addresses addresses, RefAddressTypes refAddressTypes, Students students, Date dateFrom,
			Date dateTo) {
		this.addresses = addresses;
		this.refAddressTypes = refAddressTypes;
		this.students = students;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	@GenericGenerator(name = "com.ifi.entity.StudentAddressesIdGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "students"))
	@Id
	@GeneratedValue(generator = "com.ifi.entity.StudentAddressesIdGenerator")

	@Column(name = "student_id", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	public Addresses getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_code")
	public RefAddressTypes getRefAddressTypes() {
		return this.refAddressTypes;
	}

	public void setRefAddressTypes(RefAddressTypes refAddressTypes) {
		this.refAddressTypes = refAddressTypes;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_from", length = 19)
	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_to", length = 19)
	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

}
