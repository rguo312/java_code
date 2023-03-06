package Day03;

import java.util.Scanner;

/*
//练习1：if语句实现，获取键盘输入的两个数据，并比较出较大值


 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("最大值是："+((a>b)?a:b));


    }
}
