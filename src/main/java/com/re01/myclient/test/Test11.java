package com.re01.myclient.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Test11 {
    private static int i=3;
    /**
     * 模拟爸爸去饭店
     */
    public static void fatherToRes()
    {
        System.out.println("爸爸步行去饭店需要3小时。");
    }

    /**
     * 模拟我去饭店
     */
    public static void motherToRes()
    {
        System.out.println("妈妈挤公交去饭店需要2小时。");
    }

    /**
     * 模拟妈妈去饭店
     */
    public static void meToRes()
    {
        System.out.println("我乘地铁去饭店需要1小时。");
    }


     private static CyclicBarrier cyclicBarrier=new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("一家人到齐了，开始吃饭");
        }
    });
    public static void main(String[] args){

        Thread thread = new Thread() {
            @Override
            public void run() {
                fatherToRes();
                try {
                    cyclicBarrier.await();
                    System.out.println("吃饭行动...");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                motherToRes();
                try {
                    cyclicBarrier.await();
                    System.out.println("吃饭行动...");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                meToRes();
                try {
                    cyclicBarrier.await();
                    System.out.println("吃饭行动...");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };
        thread2.start();

    }

}
