package com.re01.myclient.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Test9 {
    private static CountDownLatch countDownLatch=new CountDownLatch(3);
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

    /**
     * 模拟一家人到齐了
     */
    public static void togetherToEat()
    {
        System.out.println("一家人到齐了，开始吃饭");
    }

    public static void main(String[] args) throws Exception
    {
        new Thread(){
            @Override
            public void run(){
                fatherToRes();
                countDownLatch.countDown();
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                motherToRes();
                countDownLatch.countDown();
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                meToRes();
                countDownLatch.countDown();
            }
        }.start();
        countDownLatch.await();
        togetherToEat();
    }
}
