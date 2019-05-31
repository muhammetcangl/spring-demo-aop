package com.mcg.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    //@Before("execution(public void addAccount())") // all addAccount method
    //@Before("execution(public void com.mcg.aopdemo.dao.AccountDAO.addAccount())") // only in package method
    @Before("execution(public void add*())") // start with add methods
    public void beforeAddAccountAdvice(){

        System.out.println("======>>> Executing @Before advice on addAccount()");

    }
}
