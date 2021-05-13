package ess.java.jpa.ass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myaccount")
public class AccountData {

	@Id
	@Column(name="accountId")
	int accountId;

	@Column(name="accName")
	String accName;

	@Column(name="openingBalance")
	float openingBalance;

	public AccountData() {

	}

	public AccountData(int id, String name, float openbal) {
		this.accountId = id;
		this.accName = name;
		this.openingBalance = openbal;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}


	public float getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String toString() {
		return accountId+" "+accName+" "+openingBalance;
	}

}
