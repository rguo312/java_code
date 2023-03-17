package com.javase.ch01;

/**
 * @author :guorui
 * @Date :2023/3/19 16:46
 *
 *
 * 手机类：
 *    	成员变量：品牌、价格、颜色...
 *   	成员方法：打电话、发短信...
 */
public class Phone {
    String brand;//品牌
    int price;//价格；
    String color;//颜色

    public void  call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发消息");
    }

}
