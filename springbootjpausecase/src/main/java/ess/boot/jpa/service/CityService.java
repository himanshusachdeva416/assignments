package ess.boot.jpa.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ess.boot.jpa.entitty.City;
import ess.boot.jpa.entitty.Runner;
import ess.boot.jpa.repository.cityrepository;
import ess.boot.jpa.repository.runnerrepository;

@Service
public class CityService {
	
	@Autowired
	cityrepository cityrepo;
	
	/* insert city */
	public void insertCityService(City city) {
		cityrepo.save(city);
	}
	
	/* get all city */
	public List<City> getCityService(){
		List<City> city=cityrepo.findAll();
		return city;
	}
	
	
	/* get All data from city and runner */
	public Collection<City> getAllDataCityRunner(){
		return cityrepo.findAllByCityAndRunner();
	}
	
	/* get total distance covered by a runner */
	public List<Integer> getTotalDistance(String runname){
		return cityrepo.findByRunname(runname);
	}

}
