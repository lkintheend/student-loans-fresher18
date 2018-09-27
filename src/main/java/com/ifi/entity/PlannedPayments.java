package com.ifi.entity;
// Generated Sep 27, 2018 11:38:39 AM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PlannedPayments generated by hbm2java
 */
@Entity
@Table(name = "planned_payments", catalog = "student_loans")
public class PlannedPayments implements java.io.Serializable {

	private Integer regularOrderId;
	private RefPaymentStatus refPaymentStatus;
	private Students students;
	private Date paymentDueDate;
	private String plannedPaymentAmount;
	private String otherPaymentDetils;

	public PlannedPayments() {
	}

	public PlannedPayments(RefPaymentStatus refPaymentStatus, Students students, Date paymentDueDate,
			String plannedPaymentAmount, String otherPaymentDetils) {
		this.refPaymentStatus = refPaymentStatus;
		this.students = students;
		this.paymentDueDate = paymentDueDate;
		this.plannedPaymentAmount = plannedPaymentAmount;
		this.otherPaymentDetils = otherPaymentDetils;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "regular_order_id", unique = true, nullable = false)
	public Integer getRegularOrderId() {
		return this.regularOrderId;
	}

	public void setRegularOrderId(Integer regularOrderId) {
		this.regularOrderId = regularOrderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_status_code")
	public RefPaymentStatus getRefPaymentStatus() {
		return this.refPaymentStatus;
	}

	public void setRefPaymentStatus(RefPaymentStatus refPaymentStatus) {
		this.refPaymentStatus = refPaymentStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	public Students getStudents() {
		return this.students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "payment_due_date", length = 19)
	public Date getPaymentDueDate() {
		return this.paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	@Column(name = "planned_payment_amount")
	public String getPlannedPaymentAmount() {
		return this.plannedPaymentAmount;
	}

	public void setPlannedPaymentAmount(String plannedPaymentAmount) {
		this.plannedPaymentAmount = plannedPaymentAmount;
	}

	@Column(name = "other_payment_detils")
	public String getOtherPaymentDetils() {
		return this.otherPaymentDetils;
	}

	public void setOtherPaymentDetils(String otherPaymentDetils) {
		this.otherPaymentDetils = otherPaymentDetils;
	}

}
