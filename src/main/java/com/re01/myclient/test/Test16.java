package com.re01.myclient.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread1 implements Runnable{

    int num;
    MyThread1(int threadName){
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


public class Test16 {

    Lock lock=new ReentrantLock();

    public void getThread(){

        for(int i=0;i<100;i++){
            lock.lock();
            MyThread1 myThread1 = new MyThread1(i);
            Thread thread = new Thread(myThread1, "线程：" + i);
            thread.start();
           // lock.unlock();
        }
    }

    public static void main(String[] args) {
        Test16 test16 = new Test16();
        test16.getThread();
    }
}
