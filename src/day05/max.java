package day05;

import java.util.Scanner;

/**
 * @author :guorui
 * @Date :2023/3/14 16:18
 */
public class max {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double i =sc.nextDouble();
        double j =sc.nextDouble();
        double result =max(i,j);
        System.out.println(result);
    }

    public static double max(double i,double j) {
        if(i>j){
            return i;
        }else {
            return j;
        }


    }
}
