package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;

        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        int option;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    if (productCount >= maxProduct) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        continue;
                    }
                    System.out.print("상품 이름을 입력하세요:");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요:");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine();

                    productCount++;
                }
                case 2 -> {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i]);
                    }
                }
                case 3 -> {
                    System.out.print("프로그램을 종료합니다.");
                    return;
                }
            }
        }

    }
}
