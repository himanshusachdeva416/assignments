package ess.jdbc.ass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
		AccountDBImpl accdb = (AccountDBImpl)context.getBean("accountdbimpl");
		Account acc = (Account)context.getBean("account");
		accdb.getAll(acc);
		

	}

}
