package Day03;
/*
3.求50000以内的完备数；
提示：完备数--->它的约数(除了它本身)之和等于自己；
如：6的约数有1，2，3，1+2+3 = 6；
 */
public class Test14 {
    public static void main(String[] args) {

        for (int i = 6; i < 50000; i++) {
            int sum=0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    sum+=j;
                }

            }
            if(sum==i){
                System.out.println(""+sum);
            }
        }

    }
}
