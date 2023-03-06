package Day02;

import java.util.Scanner;

/*
键盘录入一个长方形的长和宽(长和宽为int类型),计算长方形的面积和周长
1.使用输出语句提示用户输入长方形的长
2.使用Scanner类录入长方形的长
3.使用输出语句提示用户输入长方形的宽
4.使用Scanner类录入长方形的宽
5.定义变量保存长方形的面积,面积=长*宽
6.定义变量保存长方形的周长,周长=(长+宽)*2
7.使用输出语句输出面和和周长
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        double a = sc.nextDouble();
        System.out.println("请输入长方形的宽：");
        double b  = sc.nextDouble();
        double S = a*b;
        double L = (a+b)*2;
        System.out.println("长方形的面积是："+S);
        System.out.println("长方形的周长是："+L);






    }
}
