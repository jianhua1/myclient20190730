package com.re01.myclient;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("cccccccccccccccc");
        Thread.sleep(3000);
        return "abc"+3;
    }

}

public class Test  {
    public static void main(String[] args) {
      /*  MyThread myThread = new MyThread();
        FutureTask<String> stringFutureTask = new FutureTask<>(myThread);*/
        FutureTask<String> stringFutureTask = new FutureTask<>(()-> {
           return "a";
        });
        new Thread(stringFutureTask).start();

        String s = null;
        try {
            System.out.println("dddddddddddd");
            Thread.sleep(1000);
            s = stringFutureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println("=================");
    }


}
