package ess.boot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ess.boot.jpa.entitty.Runner;
import ess.boot.jpa.service.RunService;

@RestController
@RequestMapping("/run")
public class RunController {
	
	@Autowired
	RunService runservice;
	
	/* insert runner */
	@PostMapping(value="/insertrun")
	public void insertRunner(@RequestBody Runner run) {
		runservice.insertRunnerService(run);
	}
	
	/* get all runner */
	@GetMapping(value="/getrun")
	public List<Runner> getRunner(){
		return runservice.getRunnerService();
	}

}
