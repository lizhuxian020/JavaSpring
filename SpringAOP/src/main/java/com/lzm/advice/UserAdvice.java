package com.lzm.advice;

//import org.aspectj.lang.ProceedingJoinPoint;

public class UserAdvice {
    public void save() {
        System.out.println("advice running...");
    }

    public void saveAfter() {
        System.out.println("after running...");
    }

//    public void saveAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around running...1");
//        Object proceed = pjp.proceed();
//        System.out.println("around running...2");
//    }
}
