package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        int balance = 10000;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("입금액을 입력하세요: ");
                    int depositAmount = scanner.nextInt();
                    balance = deposit(balance, depositAmount);
                    System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
                }
                case 2 -> {
                    System.out.print("출금액을 입력하세요: ");
                    int withdrawAmount = scanner.nextInt();
                    balance = withdraw(balance, withdrawAmount);
                    System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
                }
                case 3 -> {
                    System.out.println("현재 잔액: " + balance);
                }
                case 4 -> {
                    System.out.println("시스템을 종료합니다.");
                    return;
                }
                default -> {
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
                }
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance <= withdrawAmount) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= withdrawAmount;
        }
        return balance;
    }

}
