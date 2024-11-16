package loop;

public class While2_1 {
    public static void main(String[] args) {

        int sum = 0;
        int endNum = 10;

        for (int i = 1; i <= endNum; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);


        int sum2 = 0;
        int i = 1;

        while (i <= endNum) {
            sum2 += i++;
        }
        System.out.println("sum2 = " + sum2);

    }
}
