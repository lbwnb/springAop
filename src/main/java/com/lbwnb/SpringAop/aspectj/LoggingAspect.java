package com.lbwnb.SpringAop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("com.lbwnb.SpringAop.aspectj.PointcutsDefinition.customerLog()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("logBefore() id running ...");
		System.out.println("hijacked:" + joinPoint.getSignature().getName());
		System.out.println("***********");
	}
	@After("com.lbwnb.SpringAop.aspectj.PointcutsDefinition.customerLog()")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("logAfter() is running ...");
		System.out.println("hijacked:"+joinPoint.getSignature().getName());
		System.out.println("***********");
	}
/**
1.必须使用 @Aspect 在 LoggingAspect 声明之前注释，以便被框架扫描到；
2.此例 Advice 和 Pointcut 结合在一起，类中的具体方法 logBefore 和 logAfter 即为 Advice ，是要注入的代码，Advice 方法上的表达式为 Pointcut 表达式，即定义了切入点，上例中 @Before 注释的表达式代表执行 CustomerBo.addCustomer 方法时注入 logBefore 代码；
3.在 LoggingAspect 方法上加入 @Before 或者 @After 等注释；
4.execution(public * com.shiyanlou.spring.aop.aspectj.CustomerBo.addCustomer(..)) 是 Aspect 的切入点表达式，其中，*代表返回类型，后边的就要定义要拦截的方法名，这里写的的是 com.shiyanlou.spring.aop.aspectj.CustomerBo.addCustomer 表示拦截 CustomerBo 中的 addCustomer 方法，(..)代表参数匹配，此处表示匹配任意数量的参数，可以是 0 个也可以是多个，如果你确定这个方法不需要使用参数可以直接用 () ，还可以使用 (*) 来匹配一个任意类型的参数，还可以使用 (* , String ) ，这样代表匹配两个参数，第二个参数必须是 String 类型的参数
5.AspectJ 表达式，可以对整个包定义，例如，execution ( * com.shiyanlou.spring.aop.aspectj.*.*(..)) 表示切入点是 com.shiyanlou.spring.aop.aspectj 包中的任意一个类的任意方法，具体的表达式请自行搜索。

 */

}
