package com.re01.myclient.test;

import java.util.concurrent.locks.Condition;

class Thread1 extends Thread {
    static java.util.concurrent.locks.Lock lock = new java.util.concurrent.locks.ReentrantLock();
    static Condition condition1 = lock.newCondition();
    static Condition condition2= lock.newCondition();
    static boolean bol=true;
    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "--执行开始");
            try {
                if(bol){
                    bol=false;
                    condition1.await();
                }else{
                    bol=true;
                    condition1.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--执行结束");
        } finally {
            lock.unlock();
        }
    }

    public void genThread() {
        for (int i = 0; i < 100; i++) {
            Thread1 thread1 = new Thread1();
            thread1.setName("线程：" + i);
            thread1.start();
        }
    }
}

public class Condition1 {
    public void a() {
        Thread1 thread1 = new Thread1();
        thread1.genThread();
    }

    public static void main(String[] args) {
        Condition1 condition1 = new Condition1();
        condition1.a();
    }
}
