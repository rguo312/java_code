package Day04;

import java.util.Arrays;
import java.util.Scanner;
/*
//练习1：需求：定义整型数组，从键盘输入5个元素，并求其最大值
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();


        }
        for (int j = 0; j < 5; j++) {
           System.out.println(arr[j]);

        }
        System.out.println(Arrays.toString(arr));
        int max =arr[0];
        for (int a:arr) {
            if(a>max){
                max = a;
            
        }
        }
        System.out.println("最大值："+max);


    }
}
