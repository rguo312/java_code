package Day02;

import java.util.Scanner;

/*
键盘录入两个int类型的数据,交换这两个变量的值,并输出交换后的值
1.创建Scanner对象
2.录入第一个数据
3.录入第二个数据
4.定义一个临时变量temp,保存a的值
5.将b的值赋值给a
6.将临时变量temp的值赋值给b
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("交换后两个数为："+a+" "+b);


    }
}
