package Day03;
/*
6.一百元钱买百鸡,公鸡每只五元整，每只母鸡是三元；
小鸡因小价钱低，三只小鸡是一元；公鸡母鸡和小鸡，请你算出各是几？
 */
public class Test16 {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            for (int j = 0; j <34 ; j++) {
                for (int k = 0; k < 100; k++) {
                    if ((i*5+j*3+k==100)&&(i+j+k*3==100)){
                        System.out.println("公鸡:"+i+"母鸡:"+j+"小鸡:"+k*3);
                    }

                }

            }

        }
    }
}
