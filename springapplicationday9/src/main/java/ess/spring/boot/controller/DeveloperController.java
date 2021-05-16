package ess.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ess.spring.boot.entity.Developer;
import ess.spring.boot.service.DeveloperService;

@RestController
@RequestMapping(value="/developer")
public class DeveloperController {
	
	@Autowired
	DeveloperService devservice;
	
	@RequestMapping(value="/getdeveloper", method=RequestMethod.GET)
	public List<Developer> getDeveloperData(){
		System.out.println("Inside getDeveloperData Controller..!!");
		return devservice.getDevDataService();
	}
	
	@RequestMapping(value="/createdev", method=RequestMethod.POST)
	public void createDevController(@RequestBody Developer dev) {
		System.out.println("Inside createDevController Controller..!!");
		devservice.createDevService(dev);
	}
	
	@RequestMapping(value="/deletedev/{devId}", method=RequestMethod.DELETE)
	public void deleteDev(@PathVariable int devId) {
		devservice.deleteDevService(devId);
	}

}
