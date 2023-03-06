package Day03;

/**
 * 冒泡排序
 */
public class BubbleDemo {

    public static void main(String[] args) {

        double[] arr = {8.5,4.9,2.0,100.5,23.2,344.999,12.1};

        //i 比较轮数
        for (int i = 0; i < arr.length-1; i++) {
            //j 次数
            for (int j = 0; j < arr.length-i-1 ; j++) {
                //比较
                if(arr[j]<arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //输出
        for (double a : arr) {
            System.out.println(a);
        }
    }

}