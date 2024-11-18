package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자 입력");
        int num2 = scanner.nextInt();

        int max = (num1 >= num2)? num1 : num2;
        System.out.println("max = " + max);

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println("num2 = " + num2);
        } else {
            System.out.println("같음");
        }
    }
}
