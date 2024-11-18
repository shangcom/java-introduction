package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isProductEntered = false;
        int totalPrice = 0;

        int option = 0;


        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.print("상품명을 입력하세요: ");
                    String itemName = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    int itemPrice = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요: ");
                    int itemQuantity = scanner.nextInt();
                    scanner.nextLine();

                    totalPrice += itemPrice * itemQuantity;
                    isProductEntered = true;

                    System.out.println("상품명:" + itemName + " 가격:" + itemPrice + " 수량:" + itemQuantity + " 합계:" + itemPrice * itemQuantity);
                }
                case 2 -> {
                    if (!isProductEntered) {
                        System.out.println("상품을 입력해주세요.");
                    }
                    System.out.println("총 비용: " + totalPrice);
                    totalPrice = 0;
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다");
                    return;
                }
            }
        }
    }
}
