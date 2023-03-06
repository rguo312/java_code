package Day03;

import java.util.Scanner;

/*
switch语句实现根据数字输出对应星期
	需求：
  		根据键盘录入的数值1，2，3，…7输出对应的星期一，星期二，星期三…星期日。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7中一个数字：");
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("您输错了！");
                break;
        }

    }
}
