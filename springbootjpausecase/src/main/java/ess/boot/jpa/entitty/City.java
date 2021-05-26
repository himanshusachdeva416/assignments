package ess.boot.jpa.entitty;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="citydata")
public class City {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(name="cityid")
	Integer cityid;
	
	@Column(name="cityname")
	String cityname;
	
	@Column(name="cityregion")
	String cityregion;
	
	@Column(name="cityregionid")
	Integer cityregionid;
	
	@OneToMany(mappedBy = "city", fetch=FetchType.EAGER)
    private List<Runner> runner;
	
	public City() {
		
	}
	
	public City(Integer id, String name, String region, Integer regionid) {
		this.cityid = id;
		this.cityname = name;
		this.cityregion = region;
		this.cityregionid = regionid;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getCityregion() {
		return cityregion;
	}

	public void setCityregion(String cityregion) {
		this.cityregion = cityregion;
	}
	
	public Integer getCityregionid() {
		return cityregionid;
	}

	public void setCityregionid(Integer cityregionid) {
		this.cityregionid = cityregionid;
	}

	public List<Runner> getRunner() {
		return runner;
	}

	public void setRunner(List<Runner> runner) {
		this.runner = runner;
	}	
}
