package com.zxk.service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-04 09:42
 **/
@Aspect
@Component("aop")
public class AopAdvice {
    @Pointcut("execution(* *..*(..))")
    public void pt() {
    }

    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println("before..." + args[0]);
    }

    public void before1(int x) {
        System.out.println("before1..." + x);
    }


    public void after() {
        System.out.println("after");
    }

    public void afterReturning(Object ret) {
        System.out.println("afterReturning" + ret);
    }

    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing" + t.getMessage());
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println("around before");
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }

        System.out.println("around after" + proceed);
    }
}
