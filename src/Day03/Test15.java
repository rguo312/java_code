package Day03;
/*
3.1415926...=(1-1/3+1/5-1/7+1/9。。。)*4
 */
public class Test15 {
    public static void main(String[] args) {
        double num = 0.0;
        double var = 1.0;//分子
        for (int i = 1; i <1000 ; i+=2) {//分母
            num+=var/i;
            var=var*-1;

        }
        System.out.println("结果："+num*4);
    }
}
