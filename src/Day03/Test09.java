package Day03;
/*
while循环实现1-100之间数据求和
 */
public class Test09 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<100){
            i++;
            sum += i;


        }
        System.out.println(""+sum);
    }
}
