package Day04;

import java.util.Scanner;

/*
有一个数列：1,2,4,8,12,23,344，此时从键盘中任意输入一个数据，判断数列中是否包含此数
 */
public class BinaryDemo {
  /*  public static void main(String[] args) {
        int[] arr ={1,2,3,8,9,7,5,225,778};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean flage = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] ==key){
                flage = true;
            }

            }
        if(flage==true){
            System.out.println("包含此数");
        }else {
            System.out.println("不包含");


        }


    }
}*/
  public static void main(String[] args) {
      int[] arr ={1,2,3,4,5,6,7,8,9};
      int left = 0;
      int right = args.length-1;
      int middle = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("输入关键字：");
      int key = sc.nextInt();
      boolean flag = true;
      while(left<=right){
          middle = (left+right)/2;

          if(arr[middle]>key){
              right =middle-1;
          }else if(arr[middle]<key){
              left =middle +1;
          } else if (arr[middle]==key) {
              flag = false;
              System.out.println("包含");
              break;

          }
      }
      if(flag){
          System.out.println("不包含");
      }
  }

}