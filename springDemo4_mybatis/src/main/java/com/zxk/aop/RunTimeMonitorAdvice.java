package com.zxk.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: spring_day01
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-09-06 11:22
 **/
@Aspect
@Component
public class RunTimeMonitorAdvice {
    @Pointcut("execution(* com.zxk.service..*(..))")
    public void pt() {
    }

    @Around("pt()")
    public Object runTimeMonitor(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Signature signature = pjp.getSignature();
        Object proceed = null;
        long sum = 0L;
        for (int i = 0; i < 10000; i++) {
            long start2 = System.currentTimeMillis();
            proceed = pjp.proceed();
            long end2 = System.currentTimeMillis();
            sum += end2 - start2;
        }

        long end = System.currentTimeMillis();
        System.out.println(signature.getDeclaringType() + "--" + signature.getDeclaringTypeName() + "," +
                signature.getModifiers() + "," + signature.getName() + "," + signature.getClass());
        System.out.println("runTime111=" + (end - start));
        System.out.println("runTime222=" + sum);
        return proceed;
    }
}
