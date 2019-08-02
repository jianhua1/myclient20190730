package com.re01.myclient.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test6 {

    Map<String,String> map=new ConcurrentHashMap<>(16);
    public void getValue(){
        Thread thread1 = new Thread(() -> {
            for(int i=0;i<20;i++){
                map.put("thread1-"+i,""+i);
            }
        },"thread1");

        Thread thread2 = new Thread(() -> {
            for(int i=0;i<20;i++){
                map.put("thread2-"+i,""+i);
            }
        },"thread2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        map.forEach((k,v)->{
            System.out.println("k:"+k+" v:"+v);
        });
    }
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.getValue();

    }
}
