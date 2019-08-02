package com.re01.myclient.test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.locks.ReadWriteLock;

class Outputter1{
    String str="";
    public void output(String name){
        for(int i=0;i<name.length();i++){
            str=str+name.charAt(i);
        }
        System.out.println(str);
    }
}

public class LockTest {

    public static void a(){
        Date date=new Date();
        LocalDateTime localDateTime=LocalDateTime.ofInstant(date.toInstant(),ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println(format);
    }

    public static void b(){
        String str="2019-08-02 16:38:40";
        LocalDateTime parse = LocalDateTime.parse(str,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Date from1 = Date.from(parse.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(from1);
    }

    public static void c(){
        String str="2019-08-02 16:38:40";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse1 = null;
        try {
            parse1 = simpleDateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("========="+parse1);
    }



    public static void main(String[] args) {

     a();
     b();
     c();
      /*  Date date=new Date();
        System.out.println(date);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime.format(dateTimeFormatter1));*/
/*
        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String format = now2.format(dateTimeFormatter);
        System.out.println(format);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        String str="20190302";
        LocalDate parse = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);*/

    }
}
