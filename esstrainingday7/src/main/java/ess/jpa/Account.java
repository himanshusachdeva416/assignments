package ess.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	@Column(name="accId")
	int accId;
	
	@Column(name="accName")
	String accName;
	
	@Column(name="accBalance")
	Float accbalance;

	public Account() {

	}

	public Account(int id, String name, float bal) {
		this.accId = id;
		this.accName = name;
		this.accbalance = bal;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Float getAccbalance() {
		return accbalance;
	}

	public void setAccbalance(Float accbalance) {
		this.accbalance = accbalance;
	}



}
