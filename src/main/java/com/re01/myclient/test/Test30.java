package com.re01.myclient.test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class AccessibleTest {
    private int id;
    private String name;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    private void a(){
        System.out.println("++++++++a:");
    }

    private void b(String x){
        System.out.println("++++++++b:"+x);
    }
}

public class Test30 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.re01.myclient.test.AccessibleTest");
            AccessibleTest at = new AccessibleTest();
            at.setId(1);
            at.setName("AT");
            for (Field f : clazz.getDeclaredFields()) {
                f.setAccessible(true);//AccessibleTest类中的成员变量为private,故必须进行此操作
                System.out.println(f.get(at));//获取当前对象中当前Field的value
            }

            Object o = clazz.newInstance();
            Method declaredMethod = clazz.getDeclaredMethod("a");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(o);

            Method b = clazz.getDeclaredMethod("b",String.class);
            b.setAccessible(true);
            Object invoke1 = b.invoke(o, "vv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

