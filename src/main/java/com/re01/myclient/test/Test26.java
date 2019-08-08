package com.re01.myclient.test;

import redis.clients.jedis.Jedis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test26 {

    private int a=3;
    public void a(){
        redis.clients.jedis.JedisPool jedisPool=new redis.clients.jedis.JedisPool("127.0.0.1",6379);
        Jedis jedis = jedisPool.getResource();
        String username = jedis.get("username333");
        if(username==null){
            String set = jedis.set("username333", "z3");
            System.out.println("aa: "+set);
        }else{
            System.out.println("dd: "+username);
        }
    }

    private void d(){
        System.out.println("ccc");
    }

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.re01.myclient.test.Test26");
            System.out.println("=========="+aClass.getName());

            Class<Test26> test26Class = Test26.class;
            System.out.println("====----======"+test26Class.getName());

            Test26 test26 = new Test26();
            Class<? extends Test26> aClass1 = test26.getClass();
            try {
                Test26 t=new Test26();
                Object o = aClass.newInstance();
                Method[] declaredMethods = aClass.getDeclaredMethods();
                for(int i=0;i<declaredMethods.length;i++){
                    System.out.println(declaredMethods[i]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}
