package com.ws.dailyrecord.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: wangshuo
 * @Date: 2020/6/17 14:09
 */
@Getter
@Setter
@AllArgsConstructor
public class People {

    private Integer id;

    private Integer num;

    private String name;

    private String address;

}
