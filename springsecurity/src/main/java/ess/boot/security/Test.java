package ess.boot.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping(value="/test")
	public String getMethod() {
		return "Hello Himanshu";
	}

}
