package ess.spring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Autowired
	AccountService accservice;

	@RequestMapping(value="/getaccount", method=RequestMethod.GET)
	public List<Account> getAllData() {
		return accservice.getAllAccountService();
	}

	@RequestMapping(value="/sendaccount", method=RequestMethod.POST)
	public int sendAccount(@RequestBody Account account) {
		 accservice.sendAccountService(account);
		 return account.getAccountId();
	}

	@RequestMapping(value="/updateaccount", method=RequestMethod.POST)
	public Account updateAccount(@RequestBody Account account) {
		accservice.updateAccountService();
		return null;
	}

	@RequestMapping(value="/deleteaccount/{id}", method=RequestMethod.DELETE)
	public void deleteAccount(@PathVariable int accId) {
		accservice.deleteAccountById(accId);
	}

	@RequestMapping(value="/getaccountid/{id}")
	public Account getAccountById(@PathVariable int accId){
		return accservice.getAccountById(accId);
	}

}
