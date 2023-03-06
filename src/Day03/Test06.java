package Day03;

import java.util.Scanner;

/*
  输入学员的考试成绩，输出这学员考试成绩的级别。
    100      A级
    90~99    A级
    80~89    B级
    70~79    C级
    60~69    D级
    < 60     不合格
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double score = sc.nextDouble();
        int i =(int)(score/10);
        switch(i){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
                System.out.println("D级");
                break;
            case 7:
                System.out.println("C级");
                break;
            case 8:
                System.out.println("B级");
                break;
            case 9:
            case 10:
                System.out.println("A级");
                break;
            default:
                System.out.println("您输错了！");
        }
    }
}
