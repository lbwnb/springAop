package com.lbwnb.SpringAop.aspectj;

public class CustomerBo implements ICustomerBo{

	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("addCustomer() is running ...");
		
	}

	public void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("deleteCustomer() is running ...");
		
	}

	public String AddCustomerReturnValue() {
		// TODO Auto-generated method stub
		System.out.println("AddCustomerReturnValue() id running ...");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("addCustomerThrowException() is running ...");
		throw new Exception("Generic Error");
		
	}

	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
		System.out.println("addCustomerAround() is running , args:" + name);
		
	}
	

}
