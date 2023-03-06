package Day03;

/*
for循环实现1-100之间偶数和
 */
public class Test07 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;

        }
        System.out.println("sum=" + sum);
    }
}
