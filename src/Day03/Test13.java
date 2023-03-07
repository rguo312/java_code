package Day03;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        do {
            i/=10;
        }while (i%10==0);
        do{
            int j=i%10;
            System.out.print(j);
            i/=10;
        }while (i>0);
    }
}
