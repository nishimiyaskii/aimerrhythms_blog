package com.aimerrhythms.blog.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author aimerrhythms
 * @data 2020/7/26 18:33
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.aimerrhythms.blog.controller.*.*(..))")
    public void log(){}

    @Before("log()")
    public void logBefore() {
        log.info("------------- before -------------");
    }

    @After("log()")
    public void logAfter() {
        log.info("------------- after -------------");
    }

    @AfterReturning("log()")
    public void logAfterReturning() {
        log.info("------------- after return -------------");
    }

    @AfterThrowing("log()")
    public void logAfterThrowing() {
        log.info("------------- after throw -------------");
    }
}
