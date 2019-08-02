package com.re01.myclient.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Test8 {

    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(2);
        for(int i=0;i<5;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            },"a"+i).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);

    }
}
