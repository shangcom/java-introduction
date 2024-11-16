package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;

        int i = 1;
        int max = 10;

        while (i <= max) {
            sum += i;
            System.out.println("sum = " + sum);
            i++;
        }

        System.out.println("--------------------------------");

        for (int i2 = 1; i2 <= max; i2++) {
            sum2 += i2;
            System.out.println("sum2 = " + sum2);
        }

    }
}
