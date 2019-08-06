package com.re01.myclient.test;

import java.util.concurrent.*;

public class Test20 {

    public void a(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> aaaa = executorService.submit(new Callable<String>() {
            @Override
            public String call() {
                System.out.println("aaaa");
                return "aaaa";
            }
        });
        try {
            String o = aaaa.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        String str1= null;
        try {
            str1 = aaaa.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Future<String> bbbb = executorService.submit(new Callable<String>() {
            @Override
            public String call() {
                System.out.println("bbbb");
                return "bbbb";
            }
        });
        String str2 = null;
        try {
            str2 = bbbb.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(str1+"=========="+str2);

    }

    public static void main(String[] args) {
        Test20 test20=new Test20();
        test20.a();
    }
}
