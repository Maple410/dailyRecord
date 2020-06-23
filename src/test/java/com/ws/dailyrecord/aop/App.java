package com.ws.dailyrecord.aop;

import com.ws.dailyrecord.lambda.People;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:39
 * 参考链接：https://blog.csdn.net/u013276277/article/details/80300439
 */
public class App {

    public static void main(String[] args) {
        People people = new People(1,1,"1","南京");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add(people);


        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.addPeople(people);

        context.close();
    }
}
