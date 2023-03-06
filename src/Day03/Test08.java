package Day03;
/*
练习2：for循环实现在控制台打印水仙花数
分析：
 	什么是水仙花数呢?
  	所谓的水仙花数是指一个三位数[100,999]，其各位数字的立方和等于该数本身。
 	举例：153就是一个水仙花数。
 	153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class Test08 {
    public static void main(String[] args) {
      for(int i=100;i<=999;i++){
          int a =i%10;
          int b =i/10%10;
          int c =i/100%10;
          if(i==a*a*a+b*b*b+c*c*c){
              System.out.println(""+i);

          }
      }

    }
}
