package ess.boot.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ess.boot.jpa.entitty.Runner;
import ess.boot.jpa.repository.runnerrepository;

@Service
public class RunService {
	
	@Autowired
	runnerrepository runrepo;
	
	/* insert runner */
	public void insertRunnerService(Runner run) {
		runrepo.save(run);
	}
	
	/* get all runner */
	public List<Runner> getRunnerService(){
		return runrepo.findAll();
	}

}
