package com.re01.myclient.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class PrepareWork implements Runnable{

    private CyclicBarrier cyclicBarrier=null;

    PrepareWork(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }

    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+" 准备完成");
            try {
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName()+" 开始跑");
            } catch (BrokenBarrierException e) {
                System.out.println(Thread.currentThread().getName()+" 被中断");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"抛出InterruptedException异常");
        }
    }
}

public class CycleBarriesTest2 {
    static private CyclicBarrier cb=new CyclicBarrier(5, new Runnable() {
        @Override
        public void run() {
            System.out.println("****** 所有运动员已准备完毕，发令枪：跑！******");
        }
    });
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            PrepareWork prepareWork=new PrepareWork(cb);
            Thread thread=new Thread(prepareWork,""+i);
            thread.start();
            if(i==3){
                thread.interrupt();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Barrier是否损坏:"+cb.isBroken());

    }
}
