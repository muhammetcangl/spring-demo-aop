package com.mcg.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advices for logging

    // let's start with an @Before advice

    //#################################################################################
    // Asagida yapilan ornekler pointcut expressions olarak geciyor.
    //#################################################################################


    //@Before("execution(public void addAccount())") // all addAccount method
    //@Before("execution(public void com.mcg.aopdemo.dao.AccountDAO.addAccount())") // only in package method
    //@Before("execution(public void add*())") // start with add methods
    //@Before("execution(* add*())") // any return type start with add
    //@Before("execution(* add*(com.mcg.aopdemo.Account))") // any return type start with add and in param type must be matched.
    //@Before("execution(* add*(Account))") // NOT WORK because parameter must use fully qualified classname.
    //@Before("execution(* add*(com.mcg.aopdemo.Account, ..))") // second parameter anything
    //@Before("execution(* add*(..))") // parameter anything.
    @Before("execution(* com.mcg.aopdemo.dao.*.*(..))") // in package in any class and any method
    public void beforeAddAccountAdvice(){

        System.out.println("======>>> Executing @Before advice on addAccount()");

    }
}
