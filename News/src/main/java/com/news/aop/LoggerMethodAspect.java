package com.news.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerMethodAspect {

	@Before(value = "execution (* com.news..*.*(..))")	
	public void entering(JoinPoint joinPoint) {
		Logger.LogInfo("Entering Method " + joinPoint.getStaticPart().getSignature().toString());
	}
	
	@After(value = "execution (* com.news..*.*(..))")	
	public void leaving(JoinPoint joinPoint) {
		Logger.LogInfo("Leaving Method " + joinPoint.getStaticPart().getSignature().toString());
	}
}
