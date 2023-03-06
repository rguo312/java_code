package Day03;
/*
有口井7米深，一只青蛙白天爬3米，晚上坠下2米，问这青蛙几天才能爬出这口井(while)
 */
public class Test10 {
    public static void main(String[] args) {
        int s = 0;
        int day = 0;
        while (true){
            day++;
            s+=3;
            if(s>=7){
                System.out.println("爬出井口");
                break;
            }
            s-=2;
        }
        System.out.println(""+day);

    }
}
