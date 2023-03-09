package Day04;

import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,8,5,6,9,8};
        //int target = sc.nextInt();

        int target = sc.nextInt();
        for (int j = 0; j < arr.length ; j++) {
            for (int k = 0; k < j; k++) {
                if(arr[j]+arr[k]==target){
                    System.out.println("["+j+","+k+"]");
                }

            }


        }


    }

}
