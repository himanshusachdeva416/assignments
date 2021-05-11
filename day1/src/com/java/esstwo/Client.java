package com.java.esstwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {

	@Autowired
	@Qualifier("person")
	ClientPersonalDetails personaldetail;
	ClientAddress address;

	public Client() {

	}

	public Client(ClientPersonalDetails personaldetail, ClientAddress address) {
		this.personaldetail = personaldetail;
		this.address = address;
	}

	public ClientPersonalDetails getPersonaldetail() {
		return personaldetail;
	}

	public void setPersonaldetail(ClientPersonalDetails personaldetail) {
		this.personaldetail = personaldetail;
	}

	public ClientAddress getAddress() {
		return address;
	}

	public void setAddress(ClientAddress address) {
		this.address = address;
	}
}