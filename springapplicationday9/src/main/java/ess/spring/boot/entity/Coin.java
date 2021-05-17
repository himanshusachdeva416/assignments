package ess.spring.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coindata")
public class Coin {

	@Column(name="country")
	String country;
	
	@Id
	@Column(name="denomination")
	Integer denomination;
	
	@Column(name="yearofminting")
	String yearofminting;
	
	@Column(name="currentvalue")
	Integer currentvalue;
	
	@Column(name="acquireddate")
	String acquireddate;
	
	public Coin() {
		
	}
	
	public Coin(String country, Integer denom, String year, Integer current, String acdate) {
		this.country = country;
		this.denomination = denom;
		this.yearofminting = year;
		this.currentvalue = current;
		this.acquireddate = acdate;
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getDenomination() {
		return denomination;
	}

	public void setDenomination(Integer denomination) {
		this.denomination = denomination;
	}

	public String getYearofminting() {
		return yearofminting;
	}

	public void setYearofminting(String yearofminting) {
		this.yearofminting = yearofminting;
	}

	public Integer getCurrentvalue() {
		return currentvalue;
	}

	public void setCurrentvalue(Integer currentvalue) {
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
