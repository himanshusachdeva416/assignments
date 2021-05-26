package ess.springboot.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coindata")
public class Coin {
	
	@Id
	@Column(name="country")
	String country;
	
	
	@Column(name="denomination")
	int denomination;
	
	@Column(name="yearofminting")
	String yearofminting;
	
	@Column(name="currentvalue")
	int currentvalue;
	
	@Column(name="acquireddate")
	String acquireddate;
	
	public Coin() {
		
	}
	
	public Coin(String country, int denomination, String yearofminting, int currentvalue, String acquireddate) {
		this.country = country;
		this.denomination = denomination;
		this.yearofminting = yearofminting;
		this.currentvalue = currentvalue;
		this.acquireddate = acquireddate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public int getDenomination() {
		return denomination;
	}

	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}

	public String getYearofminting() {
		return yearofminting;
	}

	public void setYearofminting(String yearofminting) {
		this.yearofminting = yearofminting;
	}

	public int getCurrentvalue() {
		return currentvalue;
	}

	public void setCurrentvalue(int currentvalue) {
		this.currentvalue = currentvalue;
	}

	public String getAcquireddate() {
		return acquireddate;
	}

	public void setAcquireddate(String acquireddate) {
		this.acquireddate = acquireddate;
	}
	
	public String toString() {
		return country+" "+denomination+" "+yearofminting+" "+currentvalue+" "+acquireddate;
	}
}