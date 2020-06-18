package com.ws.dailyrecord.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: wangshuo
 * @Date: 2020/6/17 14:09
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class People {

    private Integer id;

    private Integer num;

    private String name;

    private String address;

}
