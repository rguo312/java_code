package com.javase.ch01;

/**
 * @author :guorui
 * @Date :2023/3/19 16:37
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s+"+s);
        System.out.println("姓名"+s.name);
        System.out.println("年龄"+s.age);

        s.age=32;
        s.name="张三";

        System.out.println("姓名"+s.name);
        System.out.println("年龄"+s.age);

        s.eat();
        s.study();
    }
}
