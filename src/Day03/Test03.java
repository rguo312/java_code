package Day03;

import java.util.Scanner;

/*
  练习3
  需求：飞机票在淡季是有优惠政策的,而放假期间是没有优惠的，
  假设在元旦三天（1.01---1.03），
  五一三天（5.01---5.03），
  十一七天（10.01---10.07）无任何优惠，
  除了以上13天，都打8折， 请输入您哪天订票，以及票价（自己设定一个吧），
  输出应付多少钱？
 */
public class Test03 {
    public static void main(String[] args) {
        int price = 800;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的订票日期：");
        double day = sc.nextDouble();
        if(day>=1.01&&day<=1.03){
            System.out.println("票价为:"+price);
        }else if(day>=5.01&&day<=5.03){
            System.out.println("票价为:"+price);
        }else if(day>=10.01&&day<=10.03){
            System.out.println("票价为:"+price);
        }else{
            System.out.println("票价为："+price*0.8);
        }
    }
}
