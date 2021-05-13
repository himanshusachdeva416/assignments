package ess.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account.spring")
public class NextController {
	
	@RequestMapping(method=RequestMethod.GET)
	public  String method(ModelMap data) {
		return "hello";
	}

}
