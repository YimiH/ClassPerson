package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-19
 * 18:31
 */
public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getPerInfo(){
        System.out.println("姓名:"+this.name+"年龄:"+this.age);
    }
    public String toString(){
        return ("姓名："+this.name+"   年龄:"+this.age);
    }
}
