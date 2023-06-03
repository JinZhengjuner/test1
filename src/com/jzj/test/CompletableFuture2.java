package com.jzj.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFuture2 {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + ",," + Thread.currentThread().isDaemon());
        });

        Thread.sleep(100);

    }

    private static void m1() {
        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "come in");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int result = ThreadLocalRandom.current().nextInt(10);
            return result;
        }).whenComplete((v, e) -> {
            if (e == null){
                System.out.println("-----计算完成，更新系统updateValue " + v);
            }
        }).exceptionally(e -> {
            e.printStackTrace();
            System.out.println("异常情况: " + e.getCause() + "\t" + e.getMessage());
            return null;
        });


        System.out.println("主线程结束了");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
