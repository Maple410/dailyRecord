package com.ws.dailyrecord.aop;

import java.lang.annotation.*;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:33
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
