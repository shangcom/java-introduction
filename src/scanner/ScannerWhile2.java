package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자 입력");
            int num1 = scanner.nextInt();
            System.out.println("num1 = " + num1);

            System.out.println("두번째 숫자 입력");
            int num2 = scanner.nextInt();
            System.out.println("num2 = " + num2);

            if (num1 == 0 && num2 == 0) {
                System.out.println("종료");
                break;
            }
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
        }
    }
}
