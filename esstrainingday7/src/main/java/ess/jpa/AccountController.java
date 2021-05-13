package ess.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
	
	@Autowired
	AccountRepository myrepository;
	Account account;
	
	@RequestMapping(value="/getAccount/{id}", method=RequestMethod.GET)
	public String getAllData(@PathVariable int id, Model model) {
		Optional<Account> result = myrepository.findById(id);
		account = result.get();
		model.addAttribute("Object", account);
		System.out.println(account);
		return "output";
	}

}
