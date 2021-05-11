package ess.jdbc.ass;

public class Account {

	int accId;
	String accName;
	Float accBalance;

	public Account() {

	}

	public Account(int id, String name, float bal) {
		this.accId = id;
		this.accName = name;
		this.accBalance = bal;
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

	public Float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(Float accBalance) {
		this.accBalance = accBalance;
	}



}
