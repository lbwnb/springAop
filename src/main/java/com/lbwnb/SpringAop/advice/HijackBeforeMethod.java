package com.lbwnb.SpringAop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice {

	public static void main(String[] args) {
		
	}

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("HijackBeforeMethod: Before method hijacked!");
		
		
	}
}
