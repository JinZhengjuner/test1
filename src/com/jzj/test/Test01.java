package com.jzj.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test01 {
    private static final String str = "abc";

    public static void detailLine(){
        System.out.println("this is the detail line break point");
    }

    public static void method(){
        //方法断电
        System.out.println("111111");
        System.out.println("222");
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,2);
        System.out.println("333");
        System.out.println("444");
        System.out.println("555");
    }

    public static void field(){
        A a = new A("zhangsan", 1);
        a.setAge(21);

    }

    public static void main(String[] args) {
//        detailLine();
//        method();
//        exception();
//        field();
        stream();


    }

    private static void stream() {
        Arrays.asList(1,2,3,45).stream()
                .filter(i -> i%2 == 0 || i % 3 == 0)
                .peek(x -> System.out.println(x))
                .map(i -> i*i)
                .forEach(System.out::println);
    }

    private static void exception() {
        String a = null;
        String s = a.toString();
        String s1 = a.toString();
        String s2 = a.toString();
        System.out.println();
    }
}
