package com.re01.myclient.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test4 {
    private Lock lock=new ReentrantLock();
    private void method(Thread thread){
        if(lock.tryLock()){
            lock.lock();
            System.out.println(thread.getName()+"--获得了锁");
            lock.unlock();
            System.out.println(thread.getName()+"--释放了锁");
        }else{
            System.out.println("线程"+thread.getName()+"无法获取到锁");
        }

    }

    public static void main(String[] args) {
        System.out.println("8<<3:"+(8<<3));
        System.out.println("8>>3:"+(8>>3));
        System.out.println("-8>>>3:"+(-8>>>3));
        System.out.println("8>>>3:"+(8>>>3));
       // int a = 16,c = -16;int b = 2,d = 2;System.out.print(a>>b); 结果是:4 System.out.print(c>>d);-4

        Test4 test4 = new Test4();
        Thread thread1 = new Thread(() -> {
            test4.method(Thread.currentThread());
        }, "t1");
        Thread thread2 = new Thread(() -> {
            test4.method(Thread.currentThread());
        },"t2");
        thread1.start();
        thread2.start();
    }
}
