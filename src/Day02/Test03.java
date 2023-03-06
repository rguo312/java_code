package Day02;

import java.util.Scanner;

/*
键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中,
输出结果如:我的姓名是张三,年龄25岁,身高180CM(提示姓名是String类型,需要使用Scanner的next()方法.)
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String a = sc.next();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的身高：");
        int high = sc.nextInt();
        System.out.print("我的名字是"+a+","+"年龄"+age+"岁"+",身高"+high+"CM");
//        System.out.print("年龄"+a);


    }
}
