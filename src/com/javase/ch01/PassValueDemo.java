package com.javase.ch01;

/**
 * @author :guorui
 * @Date :2023/3/17 10:00
 */
public class PassValueDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name ="张三";
        employee.workAge =10;
        employee.salary =1000000;
        change(employee);

        employee.work();

    }
    public static void change(Employee employee){
        employee.salary*=2;
        System.out.println("change():");
        employee.work();

    }


}
