package Day02;

import java.util.Scanner;

/*
键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
1.创建键盘录入对象
2.调用方法获取输入的成绩
3.使用三元运算符如果成绩大于等于60返回"及格",否则返回不"及格"
4.输出结果

 */
public class Test02 {
    public static void main(String[] args) {
        String a = "及格";
        String b = "不及格";
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = sc.nextInt();
        System.out.println((score>=60)?a:b);



    }
}
