package com.ws.dailyrecord.lambda;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangshuo
 * @Date: 2020/6/17 14:24
 *
 * Java 8 中lambda表达式的运用
 */
public class TestLambda {


    public static void main(String[] args) {

        //构造基础数据
        People p1 = new People(3, 5, "11", "111");
        People p2 = new People(2, 2, "11", "112");
        People p3 = new People(9, 3, "11", "113");
        People p4 = new People(9, 3, "11", "114");
        List<People> list = new ArrayList<>();
        list.add(p4);
        list.add(p1);
        list.add(p2);
        list.add(p3);


        //1.按照对象的某个属性分组，并取其中某个属性的集合：按照id 分组 取address的list
        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(People::getId, Collectors.mapping(People::getAddress, Collectors.toList())));
        map.forEach((k,v)->{
            System.out.println(k +":" + v);
        });
        System.out.println("----------------------------");

        //2.保持分组后有序
       Map<Integer,List<People>> sortMap =  list.stream().collect(Collectors.groupingBy(People::getId, LinkedHashMap::new, Collectors.toCollection(ArrayList::new)));
        sortMap.forEach((k,v) ->{
            System.out.println(k + ": "+ v);
        });
        System.out.println("----------------------------");

        //3.List 进行指定分隔
        List<List<People>> splitList = Lists.partition(list,2);
        splitList.forEach(item ->{
            System.out.println(item.toString());
        });
        System.out.println("----------------------------");



    }
}
