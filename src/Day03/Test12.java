package Day03;

import java.util.Scanner;

/*
打印出n行金字塔，
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
    //行数
        int n = sc.nextInt();
        //i表示当前行数，j表示空格数，k表示*；
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                char c = (char)('a'+i-1);
                System.out.print(c);
            }
            System.out.println();
        }


    }
}
