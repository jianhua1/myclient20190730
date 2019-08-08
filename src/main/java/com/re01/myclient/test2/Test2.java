package com.re01.myclient.test2;

import java.lang.reflect.Method;

class Testa{
    public String a(String username,String password){
        System.out.println("abc");
        return "username："+username+" password:"+password;
    }
}
public class Test2 {

    public void abc(){
       /* Testa testa=new Testa();
        testa.a("z3","654321");*/
        try {
            Class<?> aClass = Class.forName("com.re01.myclient.test2.Testa");
            Method a = aClass.getDeclaredMethod("a", String.class, String.class);
            Object z3 = a.invoke(aClass.newInstance(), "z3", "22");
            System.out.println(z3.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.abc();
    }
}
