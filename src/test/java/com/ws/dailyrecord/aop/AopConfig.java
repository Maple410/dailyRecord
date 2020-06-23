package com.ws.dailyrecord.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:39
 */
@Configuration
@ComponentScan("com.ws.dailyrecord.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
