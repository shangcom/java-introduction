package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }

        for (int num2 = 2, count2 = 1; count2 <= 10; num2 += 2, count2++) {
            System.out.println(num2);
        }
    }
}
