package com.jzj.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test01 {
    private static final String str = "abc";
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("3 commit", "b");

        String c = map.get("c");
        System.out.println(c);
        System.out.println("master update");
        System.out.println("hot commit");
        System.out.println("hot commit");

        System.out.println("1111");
        System.out.println("2222");

    }
}
