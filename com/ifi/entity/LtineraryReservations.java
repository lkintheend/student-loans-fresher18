package com.ifi.entity;
// Generated Sep 27, 2018 10:28:46 AM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LtineraryReservations generated by hbm2java
 */
@Entity
@Table(name = "ltinerary_reservations", catalog = "flight_booking")
public class LtineraryReservations implements java.io.Serializable {

	private Integer reservationId;
	private BookingAgents bookingAgents;
	private Passengers passengers;
	private Integer reservatiionStatusCode;
	private Integer ticketTypeCode;
	private Integer travelClassCode;
	private Date dateReservationMade;
	private Integer numberInParty;
	private Set<Legs> legses = new HashSet<Legs>(0);
	private Set<Payments> paymentses = new HashSet<Payments>(0);

	public LtineraryReservations() {
	}

	public LtineraryReservations(BookingAgents bookingAgents, Passengers passengers) {
		this.bookingAgents = bookingAgents;
		this.passengers = passengers;
	}

	public LtineraryReservations(BookingAgents bookingAgents, Passengers passengers, Integer reservatiionStatusCode,
			Integer ticketTypeCode, Integer travelClassCode, Date dateReservationMade, Integer numberInParty,
			Set<Legs> legses, Set<Payments> paymentses) {
		this.bookingAgents = bookingAgents;
		this.passengers = passengers;
		this.reservatiionStatusCode = reservatiionStatusCode;
		this.ticketTypeCode = ticketTypeCode;
		this.travelClassCode = travelClassCode;
		this.dateReservationMade = dateReservationMade;
		this.numberInParty = numberInParty;
		this.legses = legses;
		this.paymentses = paymentses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "reservation_id", unique = true, nullable = false)
	public Integer getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent_id", nullable = false)
	public BookingAgents getBookingAgents() {
		return this.bookingAgents;
	}

	public void setBookingAgents(BookingAgents bookingAgents) {
		this.bookingAgents = bookingAgents;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passenger_id", nullable = false)
	public Passengers getPassengers() {
		return this.passengers;
	}

	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}

	@Column(name = "reservatiion_status_code")
	public Integer getReservatiionStatusCode() {
		return this.reservatiionStatusCode;
	}

	public void setReservatiionStatusCode(Integer reservatiionStatusCode) {
		this.reservatiionStatusCode = reservatiionStatusCode;
	}

	@Column(name = "ticket_type_code")
	public Integer getTicketTypeCode() {
		return this.ticketTypeCode;
	}

	public void setTicketTypeCode(Integer ticketTypeCode) {
		this.ticketTypeCode = ticketTypeCode;
	}

	@Column(name = "travel_class_code")
	public Integer getTravelClassCode() {
		return this.travelClassCode;
	}

	public void setTravelClassCode(Integer travelClassCode) {
		this.travelClassCode = travelClassCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_reservation_made", length = 19)
	public Date getDateReservationMade() {
		return this.dateReservationMade;
	}

	public void setDateReservationMade(Date dateReservationMade) {
		this.dateReservationMade = dateReservationMade;
	}

	@Column(name = "number_in_party")
	public Integer getNumberInParty() {
		return this.numberInParty;
	}

	public void setNumberInParty(Integer numberInParty) {
		this.numberInParty = numberInParty;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ltinerary_legs", catalog = "flight_booking", joinColumns = {
			@JoinColumn(name = "reservation_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "leg_id", nullable = false, updatable = false) })
	public Set<Legs> getLegses() {
		return this.legses;
	}

	public void setLegses(Set<Legs> legses) {
		this.legses = legses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "reservation_payments", catalog = "flight_booking", joinColumns = {
			@JoinColumn(name = "payment_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "reservation_id", nullable = false, updatable = false) })
	public Set<Payments> getPaymentses() {
		return this.paymentses;
	}

	public void setPaymentses(Set<Payments> paymentses) {
		this.paymentses = paymentses;
	}

}
