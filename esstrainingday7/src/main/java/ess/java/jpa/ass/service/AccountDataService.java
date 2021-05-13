package ess.java.jpa.ass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ess.java.jpa.ass.entity.AccountData;
import ess.java.jpa.ass.repository.AccountDataRepository;
import ess.jpa.Account;
import ess.jpa.AccountRepository;

@Service
public class AccountDataService {
	
	@Autowired
	AccountDataRepository accrepo;
	
	public void insertDataService(AccountData accdata) {
		accrepo.save(accdata);
	}
	
	public List<AccountData> getAllDataService(){
		
		return (List<AccountData>) accrepo.findAll();
	}
	
	
	/*
	 * public String getAllDataService() { Iterable<AccountData> result =
	 * accrepo.findAll(); return "result"; }
	 */
	
	public void deleteDataService(int id) {
		accrepo.deleteById(id);
	}
	
	public void updateDataService(int id) {
		
	}

}
