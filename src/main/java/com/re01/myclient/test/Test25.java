package com.re01.myclient.test;

import org.springframework.beans.BeanUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

class Testt implements Cloneable{
    String username;
    int password;

    public Testt(String username, int password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Testb implements Cloneable{
    String username;
    int password;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
public class Test25 {

    JedisPool jedisPool=new JedisPool("127.0.0.1",6379);
    public void a(){
        Jedis resource = jedisPool.getResource();
        if(resource.get("b")==null){
            String set = resource.set("b", "china");
            System.out.println("bbbbbbbbb");
        }else{
            System.out.println(resource.get("b"));
            System.out.println("ccccc");
        }
    }

    public void b(){
/*        List list=new CopyOnWriteArrayList<String>();
        list.add("a");
        list.add("b");
        List list2=list;
        System.out.println(list2.toString());
        System.out.println(list2==list);*/

        Testt t=new Testt("z3",23);
        try {
            Testt clone = (Testt)t.clone();
            System.out.println(clone==t);
            Testt a=new Testt("w5",22);
            BeanUtils.copyProperties(t,a);
            System.out.println("======================="+t.username+"======="+t.password);
            System.out.println("======================="+a.username+"======="+a.password);
            System.out.println("beanUtils copy: "+a);
            System.out.println("clone:"+clone);
            System.out.println("t:"+t);
            t.username="l4";
            t.password=13;
            System.out.println("t.username:"+t.username);
            System.out.println("clone.username:"+clone.username);
            System.out.println("t.password:"+t.password);
            System.out.println("clone.password:"+clone.password);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public void c(){
        Testb testb=new Testb();
        testb.setPassword(123);
        testb.setUsername("zz");
        Testb d=new Testb();
        BeanUtils.copyProperties(testb,d);
        System.out.println(d.toString());
        System.out.println(testb.toString());
        System.out.println(testb.username==d.username);
        System.out.println("----------------------");
        try {
            Testb clone = (Testb)testb.clone();
            System.out.println(clone.toString());
            System.out.println(testb.toString());
            System.out.println(testb.username==clone.username);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        Test25 test25 = new Test25();
        test25.c();
    }
}
