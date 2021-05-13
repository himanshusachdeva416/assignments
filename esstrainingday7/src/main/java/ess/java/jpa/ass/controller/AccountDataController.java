package ess.java.jpa.ass.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ess.java.jpa.ass.entity.AccountData;
import ess.java.jpa.ass.service.AccountDataService;


@Controller
public class AccountDataController {
	
	@Autowired
	AccountDataService accservice;
	
	/* Insert form data into table */
	@RequestMapping(value="/insertdata", method=RequestMethod.POST)
	public String insertData(@ModelAttribute("account") AccountData ref){
			accservice.insertDataService(ref);
		return "redirect:/showaccount";
	}
	
	
	/* Get data from database */
	@RequestMapping(value="/showaccount", method=RequestMethod.GET)
	public String getAllData(Model model) {
		List<AccountData> accountdata =accservice.getAllDataService();
		model.addAttribute("AccounData",accountdata);
		System.out.println(accountdata);
		return "show";
	}
	
	/* edit data in database */
	@RequestMapping(value="editaccount/{id}", method=RequestMethod.POST)
	public String deleteData(@PathVariable int id) {
		accservice.deleteDataService(id);
		 return "redirect:/show";
	}
	
	/* update data in database */
	@RequestMapping(value="updateaccount/{id}", method=RequestMethod.POST)
	public String editData(@PathVariable int id) {
		return "redirec:/show";
	}

}
