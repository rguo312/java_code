package Day02;

import java.util.Scanner;

/*
定义int类型的变量a,定义int类型的变量b,使用三元运算符判断如果a大于b返回a与b的和,否则返回a与b的乘积,打印结果
1.定义变量a
2.定义变量b
3.使用三元运算符判断
4.打印结果
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a：");
        int a = sc.nextInt();
        System.out.println("Please Input b：");
        int b = sc.nextInt();
        System.out.println("result:"+((a>b)?(a+b):(a*b)));
    }
}
