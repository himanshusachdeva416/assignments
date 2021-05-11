package com.java.ess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)context.getBean("emp");
		emp.execute();
		emp.getEmpid();
		emp.getEmpname();
		emp.getEmppost();
	}

}
