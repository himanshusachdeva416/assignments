package ess.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {
	
	
	  String loginid ="himanshu"; 
	  String passcode = "apache@160";
	 

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		/*
		 * if(loginid == "himanshuu" && passcode == "apache@160") { new
		 * ModelAndView("account"); }else{ new ModelAndView("error"); }
		 */
		 
		return null;
	}

}
