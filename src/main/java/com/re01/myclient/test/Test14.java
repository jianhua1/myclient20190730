package com.re01.myclient.test;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.*;

public class Test14 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        HashSet<Callable<String>> objects = new HashSet<>();
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task1";
            }
        });
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task2";
            }
        });
        objects.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task3";
            }
        });
        try {
            //String s = executorService.invokeAny(objects);
            //System.out.println("result:"+s);
            List<Future<String>> futures = executorService.invokeAll(objects);
            for(int i=0;i<futures.size();i++){
                System.out.println(futures.get(i).get());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();


    }
}
