package com.ws.dailyrecord.aop;

import com.ws.dailyrecord.lambda.People;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:35
 */
@Aspect
@Component
public class LogAspect {


    //1. 注解形式
    @Pointcut("@annotation(com.ws.dailyrecord.aop.Action))")
    public void annotationPointCut(){}

    @AfterReturning(value = "annotationPointCut()&& args(people)",returning = "result")
    public void afterReturning(Object result,People people){
        System.out.println(people.getAddress() + "注解也可以");
        System.out.println(result + "返回值");
    }

    //2.方法形式 -可以获取出入参

    @AfterReturning(value = "execution(* com.ws.dailyrecord.aop.DemoMethodService.*(..))&& args(people)",returning = "result")
    public void afterMethodReturning(Object result, People people){
        System.out.println(people.toString());
        System.out.println(result + "method.. 返回值");
    }


}
