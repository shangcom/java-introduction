package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        // 사용자 입력을 받는 스캐너 생성.
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        // 엔터 치기 전까지 입력한 문자열 반환.
        String str = scanner.nextLine();
        System.out.println("입력한 문자열 : " + str);

        // 공백(space, tab, enter) 전까지 입력한 int 반환.
        System.out.println("정수를 입력하세요.");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("true/false를 입력하세요.");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("booleanValue = " + booleanValue);

        System.out.println("double을 입력하세요");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);


        /*
        int 범위 초과하는 값 입력하면 오버플로우 발생.
        개발자가 직접 캐스팅한 것은 컴파일 단계에서 당연히 가능하다고 전제하고 그대로 놔둠.
        따라서 런타임에 변수 타입의 범위 초과한 값이 들어오면 오버플로우 발생함.
         */
        System.out.println("숫자를 입력하세요:");
        long inputValue = scanner.nextLong(); // long으로 입력받음
        int overflowedValue = (int) inputValue; // 강제로 int로 형변환
        System.out.println("입력된 값 (long): " + inputValue);
        System.out.println("형변환된 값 (int): " + overflowedValue);
    }
}
