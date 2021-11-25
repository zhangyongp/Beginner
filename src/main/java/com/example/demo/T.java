package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.Thread.sleep;

public class T {

    public static void main(String[] args) throws InterruptedException {//创建使用固定线程数的线程池
        ExecutorService es2 = Executors.newFixedThreadPool(5);
        System.out.println("122");
        System.out.println("这是在做测试");
        

        for (int i = 0; i < 20; i++) {
            System.out.println("这是"+i);
            int a = i;
            es2.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "正在执行任务"+ a);
                }
            });
        }

        System.out.println("执行完毕");
}}
