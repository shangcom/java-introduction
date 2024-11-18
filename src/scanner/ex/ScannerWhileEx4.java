package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        String name = " ";
        int price = 0;
        int quantity;
        int itmePrice = 0;
        int totalPrice = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("상품을 입력하세요 : ");
                    name = scanner.nextLine();

                    System.out.print("상품의 가격을을 입력하세요 : ");
                    price = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("구매 수량을 입력하세요 : ");
                    quantity = scanner.nextInt();
                    System.out.println(quantity);
                    scanner.nextLine();

                    itmePrice = price * quantity;
                    totalPrice += itmePrice;
                    System.out.println("상품명 : " + name + ", 가격 : " + price + ", 합계 : " + itmePrice);

                }
                case 2 -> {
                    if (name.equals(" ")) {
                        System.out.println("상품 입력은 필수입니다.");
                        continue;
                    }
                    System.out.println("총 비용 : " + totalPrice);
                    name = " ";
                    totalPrice = 0;
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }

    }
}
