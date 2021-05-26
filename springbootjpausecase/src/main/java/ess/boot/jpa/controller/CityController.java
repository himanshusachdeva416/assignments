package ess.boot.jpa.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ess.boot.jpa.entitty.City;
import ess.boot.jpa.entitty.Runner;
import ess.boot.jpa.service.CityService;
import ess.boot.jpa.service.RunService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	CityService cityservice;
	
	/* insert city */
	@PostMapping(value="/insertcity")
	public void insertCityController(@RequestBody City city) {
		cityservice.insertCityService(city);
	}
	
	/* get all city */
	@GetMapping(value="/getcity")
	public List<City> getCityController(){
		return cityservice.getCityService();
	}
	
	/* get all city and runner data */
	@GetMapping(value="/getcityandrun")
	public Collection<City> getAllCityAndRunner(){
		return cityservice.getAllDataCityRunner();
	}
	
	/* get total distance covered by a runner */
	@GetMapping(value="/gettotaldistancebyrun/{runname}")
	public List<Integer> getTotalDistance(@PathVariable String runname){
		return cityservice.getTotalDistance(runname);
	}

}
