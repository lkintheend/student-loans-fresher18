package com.ifi.entity;
// Generated Sep 27, 2018 10:28:46 AM by Hibernate Tools 4.3.5.Final

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
 * BookingAgents generated by hbm2java
 */
@Entity
@Table(name = "booking_agents", catalog = "flight_booking")
public class BookingAgents implements java.io.Serializable {

	private Integer agentId;
	private String agentName;
	private String agentDetails;
	private Set<LtineraryReservations> ltineraryReservationses = new HashSet<LtineraryReservations>(0);

	public BookingAgents() {
	}

	public BookingAgents(String agentName, String agentDetails, Set<LtineraryReservations> ltineraryReservationses) {
		this.agentName = agentName;
		this.agentDetails = agentDetails;
		this.ltineraryReservationses = ltineraryReservationses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "agent_id", unique = true, nullable = false)
	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	@Column(name = "agent_name", length = 225)
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "agent_details")
	public String getAgentDetails() {
		return this.agentDetails;
	}

	public void setAgentDetails(String agentDetails) {
		this.agentDetails = agentDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookingAgents")
	public Set<LtineraryReservations> getLtineraryReservationses() {
		return this.ltineraryReservationses;
	}

	public void setLtineraryReservationses(Set<LtineraryReservations> ltineraryReservationses) {
		this.ltineraryReservationses = ltineraryReservationses;
	}

}
