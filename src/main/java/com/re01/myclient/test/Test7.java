package com.re01.myclient.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class T implements Runnable{
    @Override
    public void run(){
        System.out.println("cccc");
    }
}

public class Test7{
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4,new T());
        for(int i=0;i<4;i++){
            new Thread(()->{
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            },"a"+i).start();
        }
        System.out.println("ccccccc");
    }
}
