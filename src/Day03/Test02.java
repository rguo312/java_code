package Day03;

import java.util.Scanner;

/*
练习2：if语句实现判断学生等级
    键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
    90-100	优秀
    80-90	好
    70-80	良
    60-70	及格
    60以下   不及格
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生考试成绩：");
        int i = sc.nextInt();
        if(i>=90&&i<=100){
            System.out.println("优秀");
        } else if (i>=80&&i<90) {
            System.out.println("好");

        }else if (i>=70&&i<80) {
            System.out.println("良");

        }else if (i>=60&&i<70) {
            System.out.println("及格");

        }else if (i>=0&&i<60) {
            System.out.println("不及格");

        }else {
            System.out.println("你输入的分数有错！");
        }

    }
}
