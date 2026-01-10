package com.xpp.test;

import java.util.concurrent.*;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new MyThread());


        executorService.shutdown();


    }
}
