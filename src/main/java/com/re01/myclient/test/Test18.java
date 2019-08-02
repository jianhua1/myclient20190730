package com.re01.myclient.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test18 {
    public static void a(){
        String str="2018-02-03 12:23:11";
        LocalDateTime parse = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(Date.from(parse.atZone(ZoneId.systemDefault()).toInstant()));
    }

    public static void b(){
        Date date=new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime localDateTime1 = localDateTime.plusDays(1);
        System.out.println(localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    public static void c(){
        List<String> list = new CopyOnWriteArrayList<>();
        //List<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(o->{
            list.add("d");
            list.add("e");
            System.out.println(o);
        });
       /* for(int i=0;i<list.size();i++){
            list.remove(1);
            System.out.println(list);
        }*/
        System.out.println(list.toString());

    }

    public static void main(String[] args) {
   /*     a();
        b();*/
        b();
        c();
    }
}
