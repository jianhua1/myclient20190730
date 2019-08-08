package com.re01.myclient.test;

public class Person implements Cloneable {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         Person person=(Person) super.clone();
         return name;
    }

    public static void main(String[] args) {
        Person p = new Person(23, "zhang");
        Person p1 = null;
        try {
            p1 = (Person) p.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        String result = p.getName() == p1.getName()
                ? "clone是浅拷贝的" : "clone是深拷贝的";

        System.out.println(result);
        p1.name="22";
        System.out.println("p.name:  "+p.name);
        System.out.println("p1.name:  "+p1.name);
    }
}