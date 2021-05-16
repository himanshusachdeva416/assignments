package ess.spring.boot.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ess.spring.boot.entity.Developer;
import ess.spring.boot.repository.DeveloperRepository;

@Service
public class DeveloperService {
	
	@Autowired
	DeveloperRepository devrepo;
	
	public List<Developer>  getDevDataService() {
		List<Developer> devlop = devrepo.findAll();
		System.out.println("inside the getDevDataService method..!!");
		return devlop;
	}
	
	public void createDevService(Developer develope) {
		devrepo.save(develope);
		System.out.println("inside the createDevService..!!");
	}
	
	public void deleteDevService(int devId) {
		devrepo.deleteById(devId);
	}

}
