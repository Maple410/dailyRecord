package com.ws.dailyrecord.aop;

import com.ws.dailyrecord.lambda.People;
import org.springframework.stereotype.Service;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:34
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public String add(People people) {
        System.out.println("真正执行到了DemoAnnotationService的add方法");
        System.out.println("DemoAnnotationService.add方法结束");
        return "AfterReturning";
    }

}
