package com.ws.dailyrecord.aop;

import com.ws.dailyrecord.lambda.People;
import org.springframework.stereotype.Service;

/**
 * @Author: wangshuo
 * @Date: 2020/6/23 16:59
 */
@Service
public class DemoMethodService {

    public String addPeople(People people){
        return "addPeople";
    }
}
