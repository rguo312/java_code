package Day02;

import java.util.Scanner;

/*
定义一个int类型的变量,初始化值为123,求这个数的个位,十位,百位分别是多少,输出结果:123的个位是3,十位是2,百位是1

 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int i = sc.nextInt();
        int a = i%10;
        int b = i/10%10;
        int c = i/100%10;
        System.out.println("个位数是："+a);
        System.out.println("十位数是："+b);
        System.out.println("百位数是："+c);



    }
}
