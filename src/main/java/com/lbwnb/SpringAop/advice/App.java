package com.lbwnb.SpringAop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"SpringAOPAdvice.xml"});
	
	CustomerService cust = (CustomerService) appContext.getBean("customerService");
	
	System.out.println("使用Spring AOP如下");
	System.out.println("********************");
	cust.printName();
	System.out.println("********************");
	cust.printURL();
	System.out.println("********************");
	try {
		cust.printThrowException();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
