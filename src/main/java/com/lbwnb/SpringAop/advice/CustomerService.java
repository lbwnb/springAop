package com.lbwnb.SpringAop.advice;

public class CustomerService {
	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		// TODO Auto-generated method stub
		System.out.println("Customer name:" + this.name);
	}

	public void printURL() {
		// TODO Auto-generated method stub
		System.out.println("Customer website :" + this.url);

	}

	public void printThrowException() {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}

}
