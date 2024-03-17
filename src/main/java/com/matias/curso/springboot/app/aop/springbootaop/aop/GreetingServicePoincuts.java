package com.matias.curso.springboot.app.aop.springbootaop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePoincuts {

    @Pointcut("execution(* com.matias.curso.springboot.app.aop.springbootaop.services.IGreetingService.*(..))")
    public void greetingLoggerPointCut(){}

    @Pointcut("execution(* com.matias.curso.springboot.app.aop.springbootaop.services.IGreetingService.*(..))")
    public void greetingFooLoggerPointCut(){}
}
