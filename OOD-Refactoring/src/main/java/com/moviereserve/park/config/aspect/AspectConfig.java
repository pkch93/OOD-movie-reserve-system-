package com.moviereserve.park.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
	
	Logger logger = LoggerFactory.getLogger(AspectConfig.class); 
	@Pointcut("*")
	public void performance(){};
	
	@Around("performance()")
	public void logger(ProceedingJoinPoint jp) {
		try {
			
			jp.proceed();
		}	
		 catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
