package com.re01.myclient.test;

public class Test10 {
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

    /**
     * 模拟一家人到齐了
     */
    public static void togetherToEat()
    {
        System.out.println("一家人到齐了，开始吃饭");
    }

    public static void main(String[] args) throws Exception
    {
        Thread thread = new Thread() {
            @Override
            public void run() {
                fatherToRes();
                i--;
            }
        };
        thread.start();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                motherToRes();
                i--;
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                meToRes();
                i--;
            }
        };
        thread2.start();
        thread.join();
        thread1.join();
        thread2.join();
        togetherToEat();

    }
}
