package com.jzj.test;

public class Test02 {

    public static void conditions(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "thread1");
        Thread t2 = new Thread(myThread, "thread2");
        Thread t3 = new Thread(myThread, "thread3");
        t1.start();
        t2.start();
        t3.start();

    }

    public static void main(String[] args) {
        conditions();
    }
}
