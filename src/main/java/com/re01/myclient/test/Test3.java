package com.re01.myclient.test;

import java.util.concurrent.*;

public class Test3 {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> strings = new ConcurrentLinkedQueue<>();
        strings.add("1");
        strings.add("2");
        System.out.println(strings.peek());
        System.out.println(strings.size());
        System.out.println(strings.poll());
        System.out.println(strings.size());
        System.out.println("-------------1----------");
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(2);
        try {
            arrayBlockingQueue.offer("a",3,TimeUnit.SECONDS);
            arrayBlockingQueue.offer("b",3,TimeUnit.SECONDS);
            arrayBlockingQueue.offer("c",3,TimeUnit.SECONDS);
            System.out.println(arrayBlockingQueue.poll(3,TimeUnit.SECONDS));
            System.out.println(arrayBlockingQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------2------------");
     /*   ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            final int temp=i;
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+" i:"+temp);
            });
        }*/
      /*  System.out.println("------------3-------------");
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            final int temp=i;
            executorService1.execute(()->{
                System.out.println(Thread.currentThread().getName()+" j:"+temp);
            });
        }
        System.out.println("-------------4------------");
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            final int temp=i;
            executorService2.execute(()->{
                System.out.println(Thread.currentThread().getName()+" k:"+temp);
            });
        }*/
        System.out.println("------------5-------------");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getName());
        },100,100,TimeUnit.MILLISECONDS);

    }
}
