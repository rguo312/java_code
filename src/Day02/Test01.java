package Day02;

import java.util.Scanner;

/*
键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
1.创建键盘录入对象
2.调用方法获取输入的数据
3.将变量%2如果 == 0 是偶数,否则是奇数
4.输出结果
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int i = sc.nextInt();
        if(i%2==0){
            System.out.println("该数是偶数");
        }
        else {
            System.out.println("该数是奇数");
        }
    }
}
