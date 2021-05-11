package com.java.esstwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		Client c = (Client)context.getBean("client");
		System.out.println(c.personaldetail.getName());
		System.out.println(c.personaldetail.getOccupation());
		
		System.out.println(c.address.getState());
		System.out.println(c.address.getDistrict());
		System.out.println(c.address.getCity());
	}

}
