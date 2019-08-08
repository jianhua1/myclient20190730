package com.re01.myclient.test;

import com.re01.myclient.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test29 {
    class Test1 {
        private String color = "blue";
        //无参数的私有方法使用私有属性
        private void queryColor() {
            System.out.println("vvvvvvvvv: "+color);
        }
        //一个参数的私有方法
        private void privateTest1(String param1) {
            System.out.println(">>>>>>" + param1 + ">>>>>>>>>" + color + ">>>>>>>>>>");
        }
        //两个参数的私有方法
        private void privateTest2(String param1, String param2) {
            System.out.println(">>>>>>" + param1 + ">>>>>>>>>" + param2 + ">>>>>>>>");
        }
    }

    //利用反射机制获取内部类的私有属性和方法,并且修改私有属性的值
    public static void main(String[] args) {
        try {
            Test29 test29 = new Test29();
            Test1 test1 = test29.new Test1();
//获取内部类的私有属性
            Field colorField = Test1.class.getDeclaredField("color");
            System.out.println("============"+colorField);
//设置为true表示可以访问private修饰的私有属性
            //colorField.setAccessible(true);
            System.out.println("------------"+colorField);
//color的值改为red
            colorField.set(test1, "red");
//获取内部类的私有方法,无参数的
            Method method = Test1.class.getDeclaredMethod("queryColor");
//设置为true表示可以访问private修饰的私有方法
            method.setAccessible(true);
            System.out.println(method);
//用来执行指定对象的方法，无参数的
            method.invoke(test1);

//获取内部类的私有方法,一个参数的
            Method method1 = Test1.class.getDeclaredMethod("privateTest1", String.class);
//设置为true表示可以访问private修饰的私有方法
            method1.setAccessible(true);
            System.out.println(method1);
//用来执行指定对象的方法，前面test1是对象，后面的是一个参数
            method1.invoke(test1, "我调用了你的私有方法！！！");

//获取内部类的私有方法,两个参数的
            Method method2 = Test1.class.getDeclaredMethod("privateTest2", String.class, String.class);
//设置为true表示可以访问private修饰的私有方法
            method2.setAccessible(true);
            System.out.println(method2);
//用来执行指定对象的方法，前面test1是对象，后面的是两个参数
            method2.invoke(test1, "用我的参数1", "用我的参数2");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
