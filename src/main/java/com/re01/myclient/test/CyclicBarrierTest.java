package com.re01.myclient.test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    // 等待3个线程到达同步屏障，全部到达后优先执行一个 Runnable
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(4,
            () -> System.out.println("全部到达同步屏障" + LocalDateTime.now()));

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        Runnable runnable = () -> {
            System.out.println("到达同步屏障" + LocalDateTime.now()+"========="+Thread.currentThread().getName());
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("继续执行");
        };
        List<Runnable> list = Arrays.asList(runnable, runnable, runnable);
        list.forEach(runnable1 -> new Thread(runnable1).start());
        Thread.sleep(1000);
        System.out.println("最后一个线程到达同步屏障");
        cyclicBarrier.await();
    }

}