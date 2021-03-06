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
 * RefBanks generated by hbm2java
 */
@Entity
@Table(name = "ref_banks", catalog = "student_loans")
public class RefBanks implements java.io.Serializable {

	private Integer bankCode;
	private String bankName;
	private Set<Accounts> accountses = new HashSet<Accounts>(0);

	public RefBanks() {
	}

	public RefBanks(String bankName, Set<Accounts> accountses) {
		this.bankName = bankName;
		this.accountses = accountses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "bank_code", unique = true, nullable = false)
	public Integer getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(Integer bankCode) {
		this.bankCode = bankCode;
	}

	@Column(name = "bank_name")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refBanks")
	public Set<Accounts> getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set<Accounts> accountses) {
		this.accountses = accountses;
	}

}
