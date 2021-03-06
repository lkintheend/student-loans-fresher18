package com.ifi.entity;
// Generated Sep 27, 2018 10:28:46 AM by Hibernate Tools 4.3.5.Final

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
 * FlightCosts generated by hbm2java
 */
@Entity
@Table(name = "flight_costs", catalog = "flight_booking")
public class FlightCosts implements java.io.Serializable {

	private Integer flightNumber;
	private FlightSchedules flightSchedules;
	private RefCalendar refCalendar;
	private Integer aircraftTypeCode;
	private Date validFromDate;
	private Integer flightCost;

	public FlightCosts() {
	}

	public FlightCosts(FlightSchedules flightSchedules) {
		this.flightSchedules = flightSchedules;
	}

	public FlightCosts(FlightSchedules flightSchedules, RefCalendar refCalendar, Integer aircraftTypeCode,
			Date validFromDate, Integer flightCost) {
		this.flightSchedules = flightSchedules;
		this.refCalendar = refCalendar;
		this.aircraftTypeCode = aircraftTypeCode;
		this.validFromDate = validFromDate;
		this.flightCost = flightCost;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "flightSchedules"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "flight_number", unique = true, nullable = false)
	public Integer getFlightNumber() {
		return this.flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public FlightSchedules getFlightSchedules() {
		return this.flightSchedules;
	}

	public void setFlightSchedules(FlightSchedules flightSchedules) {
		this.flightSchedules = flightSchedules;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "valid_to_date")
	public RefCalendar getRefCalendar() {
		return this.refCalendar;
	}

	public void setRefCalendar(RefCalendar refCalendar) {
		this.refCalendar = refCalendar;
	}

	@Column(name = "aircraft_type_code")
	public Integer getAircraftTypeCode() {
		return this.aircraftTypeCode;
	}

	public void setAircraftTypeCode(Integer aircraftTypeCode) {
		this.aircraftTypeCode = aircraftTypeCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "valid_from_date", length = 19)
	public Date getValidFromDate() {
		return this.validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	@Column(name = "flight_cost")
	public Integer getFlightCost() {
		return this.flightCost;
	}

	public void setFlightCost(Integer flightCost) {
		this.flightCost = flightCost;
	}

}
