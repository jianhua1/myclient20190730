package com.re01.myclient.test;


import java.util.concurrent.FutureTask;

public class Test2 {
    public void getResult(){
        FutureTask<String> stringCallable = new FutureTask<>(() -> {
             String a="2";
             return "abc"+a;
        });
        try {
            new Thread(stringCallable).start();
            String s = stringCallable.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.getResult();
    }
}
