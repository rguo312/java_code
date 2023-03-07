package Day04;

public class oneArrDemo {
    public static void main(String[] args) {
        int[] arr= new  int[3];
        char[] brr = {'a','v','s','d'};
        System.out.println(arr[2]);
        System.out.println(brr[2]);

        for (int i = 0; i < brr.length ; i++) {
            System.out.printf(brr[i]+"\t");
            
        }
        for(char x:brr){
            System.out.print("\t"+x);
        }

    }

}
