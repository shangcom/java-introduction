package array.ex;

import java.util.Scanner;

/*
문제 - 가장 작은 수, 큰 수 찾기
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
그램을 작성하자. 실행 결과 예시를 참고하자.

실행 결과 예시
입력받을 숫자의 개수를 입력하세요:3
3개의 정수를 입력하세요:
1
2
5
가장 작은 정수: 1
가장 큰 정수: 5
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println(count + "개의 정수를 입력하세요");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
