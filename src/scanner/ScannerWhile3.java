package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("더할 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("종료");
                break;
            }
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
