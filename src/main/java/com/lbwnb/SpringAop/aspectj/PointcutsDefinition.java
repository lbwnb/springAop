package com.lbwnb.SpringAop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutsDefinition {
@Pointcut("execution(* com.lbwnb.SpringAop.aspectj.CustomerBo.*(..))")
public void customerLog() {
	
	/**
1.类声明前加入 @Aspect 注释，以便被框架扫描到。
2.@Pointcut 是切入点声明，指定需要注入的代码的位置，如上例中指定切入点为 CustomerBo 类中的所有方法，在实际业务中往往是指定切入点到一个逻辑层，例如 execution (* com.shiyanlou.spring.aop.aspectj.*.*(..)） ，表示 aop 切入点为 aspectj 包中所有类的所有方法，具体的表达式后边会有介绍。
3.方法 customerLog 是一个签名，在 Advice 中可以用此签名代替切入点表达式，所以不需要在方法体内编写实际代码，只起到助记功能，例如此处代表操作 CustomerBo 类时需要的切入点。

	 */
}
}
