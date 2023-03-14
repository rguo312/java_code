package day05;

import java.util.Scanner;

/**
 * @author :guorui
 * @Date :2023/3/14 16:25
 */
public class ThreeMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double i =sc.nextDouble();
        double j =sc.nextDouble();
        double k =sc.nextDouble();
        double result = ThreeMax(i,j,k);
        System.out.println(result);

    }
        public static double ThreeMax(double i,double j,double k) {
            if (i > j && i > k) {
                return i;
            } else if (j > i && j > k) {
                return j;

            } else if (k > i && k > j) {
                return k;
            }
            return 0;


        }

        }
