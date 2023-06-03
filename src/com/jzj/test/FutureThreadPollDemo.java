package com.jzj.test;

import java.util.concurrent.*;

public class FutureThreadPollDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        long start = System.currentTimeMillis();

        FutureTask<String> futureTask = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(500);
            return "task1  over";
        });
        executorService.submit(futureTask);

        FutureTask<String> futureTask2 = new FutureTask<>(() -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "task2  over";
        });
        executorService.submit(futureTask);
        executorService.submit(futureTask2);
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(futureTask.get());
        System.out.println(futureTask2.get());

        executorService.shutdown();

        System.out.println("耗时：  " + (System.currentTimeMillis() - start));




    }

    private static void m1() {
        long starter = System.currentTimeMillis();
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("耗时:  " + (System.currentTimeMillis() - starter));
    }
}
