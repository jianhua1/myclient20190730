package com.re01.myclient.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Service{
    Lock lock=new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    boolean bol=true;
    public void getS(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"---0开始");
        if(bol==true){
            try {
                bol=false;
                condition1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bol=true;
        System.out.println(Thread.currentThread().getName()+"---0结束");
        lock.unlock();
        condition2.notify();
    }

    public void setS(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"---1开始");
        if(bol==true){
            try {
                bol=false;
                condition2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bol=true;
        System.out.println(Thread.currentThread().getName()+"---1结束");
        lock.unlock();
        condition1.notify();
    }
}

class MyThreadA extends Thread{
    Service service;
    MyThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run() {
        service.getS();
    }
}

class MyThreadB extends Thread{
    Service service;
    MyThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run() {
        service.setS();
    }
}

public class Test24 {
    public static void main(String[] args) {
        Service service=new Service();
        MyThreadA myThread1 = new MyThreadA(service);
        myThread1.start();
        MyThreadB myThread2 = new MyThreadB(service);
        myThread2.start();
    }
}
