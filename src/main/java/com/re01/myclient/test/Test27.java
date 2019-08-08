package com.re01.myclient.test;

import com.re01.myclient.Test;

class Test27
{
    char foo='中';
    private int data;
    int result = 0;
    public void m()
    {
        result += 2;
        data += 2;
        System.out.print(result + "  " + data);
    }
}
class ThreadExample extends Thread
{
    private Test27 mv;
    public ThreadExample(Test27 mv)
    {
        this.mv = mv;
    }
    public void run()
    {
        synchronized(mv)
        {
            mv.m();
        }
    }
}
class ThreadTest
{
    public static void main(String args[])
    {
        Test27 mv = new Test27();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}
