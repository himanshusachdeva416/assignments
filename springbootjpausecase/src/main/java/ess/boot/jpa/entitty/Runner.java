package ess.boot.jpa.entitty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rundata")
public class Runner {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(name = "runid")
	Integer runid;
	
	@Column(name = "runname")
	String runname;
	
	@Column(name = "runcity")
	String runcity;
	
	@Column(name = "rundistance")
	Integer rundistance;
	
	@Column(name = "cityid")
	Integer runnercityid;
	
	@Column(name="cityregionid")
	Integer cityregionid;

	@ManyToOne
	@JoinColumn(name = "city")
	private City city;

	public Runner() {
		
	}
	
	public Runner(Integer id, String name, String runcity, Integer distance, Integer cityid, Integer regionid ) {
		this.runid = id;
		this.runname = name;
		this.runcity = runcity;
		this.rundistance = distance;
		this.runnercityid = cityid;
		this.cityregionid = regionid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRunid() {
		return runid;
	}

	public void setRunid(Integer runid) {
		this.runid = runid;
	}

	public String getRunname() {
		return runname;
	}

	public void setRunname(String runname) {
		this.runname = runname;
	}

	public String getRuncity() {
		return runcity;
	}

	public void setRuncity(String runcity) {
		this.runcity = runcity;
	}

	public Integer getRundistance() {
		return rundistance;
	}

	public void setRundistance(Integer rundistance) {
		this.rundistance = rundistance;
	}

	public Integer getRunnercityid() {
		return runnercityid;
	}

	public void setRunnercityid(Integer runnercityid) {
		this.runnercityid = runnercityid;
	}

	public Integer getCityregionid() {
		return cityregionid;
	}

	public void setCityregionid(Integer cityregionid) {
		this.cityregionid = cityregionid;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	

}
