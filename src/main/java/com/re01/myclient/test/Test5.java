package com.re01.myclient.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test5 {

    volatile int i=6;
    AtomicInteger atomicInteger=new AtomicInteger(2);

    public void getValue(){
        Thread thread1 = new Thread(() -> {
            i=i+1;
            System.out.println(i);
            System.out.println(Thread.currentThread().getName()+":"+atomicInteger.incrementAndGet());
        },"thread1");

        Thread thread2 = new Thread(() -> {
            i=i+1;
            System.out.println(i);
            System.out.println(Thread.currentThread().getName()+":"+atomicInteger.incrementAndGet());
        },"thread2");
        thread1.start();
        thread2.start();
    }
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.getValue();
    }
}
