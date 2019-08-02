package com.re01.myclient.test;

class LockThread implements Runnable{

    static int num=0;
    @Override
    public void run(){
       num=num+1;
       System.out.println("线程名"+Thread.currentThread().getName()+": "+num);
    }
}

public class Test12 {

    public static void main(String[] args) {
       for(int i=0;i<3;i++){
           Thread thread = new Thread(new LockThread(), "" + i);
           thread.start();
       }
    }
}
