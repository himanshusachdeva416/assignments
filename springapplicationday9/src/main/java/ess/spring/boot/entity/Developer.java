package ess.spring.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="developertable")
public class Developer {
	
	@Id
	@Column(name="dev_id")
	int devId;
	
	@Column(name="dev_name")
	String devName;
	
	@Column(name="dev_tech")
	String devtech;
	
	public Developer() {
		
	}
	
	public Developer(int id, String name, String tech) {
		this.devId = id;
		this.devName =name;
		this.devtech = tech;
	}

	public int getDevId() {
		return devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevtech() {
		return devtech;
	}

	public void setDevtech(String devtech) {
		this.devtech = devtech;
	}
}
