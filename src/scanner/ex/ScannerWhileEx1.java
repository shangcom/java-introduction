package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            /*
            nextInt()는 입력 스트림에서 int 값만 가져오고 '\n'(줄바꿈)은 소비하지 못함.
            줄바꿈 소비하지 않은 상태에서 반복문 처음으로 돌아가면,
                        String name = scanner.nextLine();
            여기에서 남아있던 줄바꿈을 nextLine()이 받아서 이름 입력 없이 넘어간다.
            정확히는 이름 입력해야하는 곳에서 이전에 남아있던 줄바꿈을 처리하느라 이름을 입력할 수가 없어진다.
            따라서 반복문이 끝나기 전에 '\n'을 소비할 수 있는 nextLine()을 호출해서 없애준다.
             */
            int age = scanner.nextInt();
            scanner.nextLine(); // 남아있는 /n 소비.
            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }

    }

}
