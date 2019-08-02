package com.re01.myclient.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test13 {
    public static void main(String[] args) {
        try {
            /*ExecutorService executorService = Executors.newCachedThreadPool();*/
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            executorService.execute(new Thread(()->{
                System.out.println("aaaaaaaaa");
            }));
            executorService.execute(new Thread(()->{
                System.out.println("bbbbbbbbb");
            }));
            Future<?> ab = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("eeeeee");
                }
            });
            System.out.println(ab.get());
            Future<?> abc = executorService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    System.out.println("abcdefg");
                    return "hahaha...";
                }
            });
            System.out.println(abc.get());
            executorService.execute(new Thread(()->{
                System.out.println("ccccccccc");
            }));
            System.out.println("ddd");
            executorService.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
