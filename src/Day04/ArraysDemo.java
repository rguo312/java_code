package Day04;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10,25,65,7,88};
        int[] brr = new int[args.length];
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("brr:"+Arrays.toString(brr));

        System.out.println(Arrays.equals(arr,brr));
        System.out.println(arr==brr);
    }



}