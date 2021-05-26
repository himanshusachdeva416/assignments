package ess.boot.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/get")
	public String getString() {
		System.out.println("Testing done..!!");
		return "tested";
	}

}