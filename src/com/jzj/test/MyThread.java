package com.jzj.test;

public class MyThread extends Thread {

    private int i;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        i += 10;
        System.out.println(Thread.currentThread().getName());
    }
}
