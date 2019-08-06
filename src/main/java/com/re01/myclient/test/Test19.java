package com.re01.myclient.test;

import org.apache.tomcat.jni.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test19 {

    public void a(){
        String str="2019-02-03 12:12:10";
        LocalDateTime localDateTime=LocalDateTime.parse(str,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Date from = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(from);
    }

    public void b(){
        Date date=new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);
    }

    public static void main(String[] args) {
        Test19 test19 = new Test19();
        test19.b();
    }
}
