package com.re01.myclient.test2;


import java.lang.reflect.Field;

public class Test1 {

    @MyAnno01(b="24")
    public String a;
    @MyAnno01(a="sha1",b="hehe")
    public String password;

    public void getAnotination(Class clazz){
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            boolean annotationPresent = declaredField.isAnnotationPresent(MyAnno01.class);
            if (annotationPresent){
                MyAnno01 annotation = declaredField.getAnnotation(MyAnno01.class);
                System.out.println(declaredField.getName()+": "+annotation.a()+"======"+annotation.b());
            }
        }
    }
    public static void main(String[] args) {
         Test1 test1=new Test1();
         test1.getAnotination(Test1.class);
    }
}
