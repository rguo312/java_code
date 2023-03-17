package com.javase.ch01;

/**
 * @author :guorui
 * @Date :2023/3/19 17:00
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println("品牌"+p.brand);
        System.out.println("价格"+p.price);
        System.out.println("颜色"+p.color);

        p.brand="iphone";
        p.color ="black";
        p.price=5999;

        p.call("张三");
        p.sendMessage();
    }
}
