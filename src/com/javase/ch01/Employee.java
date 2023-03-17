package com.javase.ch01;

/**
 * @author :guorui
 * @Date :2023/3/17 9:55
 */
public class Employee {
    String name;
    int workAge;
    double salary;


    Employee work(){
        System.out.println(name+"一位工龄为"+workAge+"的员工，薪资为："+salary);
        return null;
    }

}
