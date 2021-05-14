package ess.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="accountname")
public class Account {

	@javax.persistence.Id
	@Column(name="accountId")
	int accountId;

	@Column(name="accName")
	String accName;
	
	public Account() {

	}

	public Account(int id, String name) {
		this.accountId = id;
		this.accName = name;
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

}
