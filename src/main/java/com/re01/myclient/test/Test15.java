package com.re01.myclient.test;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test15 {
    public void getThread(){

        //DateTimeFormatter dateTimeFormatter = new DateTimeFormatter();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ThreadLocal<SimpleDateFormat> threadLocal=new ThreadLocal<SimpleDateFormat>(){
            @Override
            protected SimpleDateFormat initialValue() {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=0;i<2000;i++){
            executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    SimpleDateFormat simpleDateFormat = threadLocal.get();
                    String str="2012-02-03 12:22:33";
                    Date parse = simpleDateFormat.parse(str);
                    String format = simpleDateFormat.format(parse);
                    System.out.println(str.equals(format)+"===="+format);
                    return "1";
                }
            });
        }
    }
    public static void main(String[] args) {
        Test15 test15 = new Test15();
        test15.getThread();
    }
}
