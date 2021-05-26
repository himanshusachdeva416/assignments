package ess.spring;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService{
	
	@Autowired
	AccountRepository accountrepo;
	
	public List<Account> getAllAccountService(){
		List<Account> account =  (List<Account>) accountrepo.findAll();
		return account;
	}
	
	public void sendAccountService(Account account) {
		accountrepo.save(account);
	}
	
	public void updateAccountService() {
		accountrepo.save(null);
	}
	
	public void deleteAccountById(int accId) {
		accountrepo.deleteById(accId);
	}
	
	public Account getAccountById(int accId) {
		
		return accountrepo.findById(accId).get();
	}

}
