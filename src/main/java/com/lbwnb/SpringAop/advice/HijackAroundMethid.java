package com.lbwnb.SpringAop.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethid implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method name : " + methodInvocation.getMethod().getName());
		System.out.println("Method arguments : " +Arrays.toString(methodInvocation.getArguments()));
		
		//相当于 MethodBeforeAdvice
		System.out.println("HIjackAroundMethod : Before method hijiaked!");
		
		try {
			//调用原方法，即调用CustomerService中的方法
			Object result = methodInvocation.proceed();
			
			//相当于 AfterReturningAdvice
			System.out.println("HijackAroundMethod : After method hijacked!");
			
			return result;
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("HijacaAroundMethid : Throw exception hijacked!");
			
			throw e;
		}
		
		
	}

}
