package com.jzj.test;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new MyThread());

        Thread thread = new Thread(futureTask,"t1");
        thread.start();

        System.out.println(futureTask.get());
    }




    static class MyThread implements Callable<String>{

        @Override
        public String call() throws Exception {
            //call able有返回值，可抛出异常
            System.out.println("ccccccccc");
            return "call呗调用了";
        }
    }
}
