package Day03;

import java.util.Scanner;

/*
 需求：switch示例：从键盘接收两个数字,再接收一个符号,然后进行运算.
  如果输入的是错误的字符,不进行计算而是提示不存在字符
  -------请输入第一个数字:8
  -------请输入第二个数字:9
  -------请输入运算符号:+
  -------8+9=17
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("亲输入两个数字：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("请输入+ - * /中的一个");
        String sr = sc.next();
        switch (sr){
            case "+":
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case "-":
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case "*":
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case "/":
                System.out.println(a+"/"+b+"="+(a/b));
            default:
                System.out.println("不存在该字符");
                break;
        }
    }

}
