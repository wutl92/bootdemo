package com.wutl.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-2-21 11:40
 */
@Aspect
@Component
public class Logging {
    @Pointcut("execution(* com.wutl.demo.service.*.*(..))")
    void writLog(){
        System.out.println("writLog...");
    }

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("writLog()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("writLog()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "writLog()", returning="retVal")
    public void afterReturningAdvice(Object retVal){
        if (retVal != null) {
            System.out.println("Returning:" + retVal.toString() );
        }else{
            System.out.println("Returning.");
        }
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */
    @AfterThrowing(pointcut = "writLog()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
