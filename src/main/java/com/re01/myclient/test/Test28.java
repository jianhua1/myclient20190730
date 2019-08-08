package com.re01.myclient.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;

class Testb2{
    private void d(){
        System.out.println("***********************");
    }
    public void c(){
        System.out.println("cccccccccccccccccccccc");
    }
}
class Tesb1 extends Testb2{

    private String x,y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    private void e(){
        System.out.println("+++++++++++++++++++");
    }

    public void a(){
        String source="e:/122.txt",dest="e:/23456.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(dest,true);
            FileChannel channel = fileInputStream.getChannel();
            FileChannel channel1 = fileOutputStream.getChannel();
            fileInputStream.getChannel().transferTo(0,channel.size(),channel1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void b(){
        try {
            Class<?> aClass2 = Class.forName("com.re01.myclient.test.Tesb1");
            Object o = aClass2.newInstance();

            Field[] declaredFields = aClass2.getDeclaredFields();
            for (Field declaredField : declaredFields) {
               // declaredField.setAccessible(true);
                declaredField.set(o,"咋整");
                System.out.println("################declaredField: "+declaredField.getName()+"========"+declaredField.get(o));
            }
            System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
            Method[] declaredMethods = aClass2.getMethods();
            for (Method declaredMethod : declaredMethods) {
                String name = declaredMethod.getName();
                System.out.println("-----------getDeclaredMethods:"+name);
                if("d".equals(name)){
                    Object invoke = declaredMethod.invoke(o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      /*  Test28 test28 = new Test28();
        Class<? extends Test28> aClass = test28.getClass();
        System.out.println(test28Class.getName());
        System.out.println(aClass.getName());
*/
    }


}
public class Test28 {
    public static void main(String[] args) {
        Tesb1 tesb1 = new Tesb1();
        tesb1.b();
    }
}
