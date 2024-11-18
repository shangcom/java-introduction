package array.ex;

import java.util.Arrays;
import java.util.Scanner;

/*
문제 - 2차원 배열2
이전 문제에서 학생수를 입력받도록 개선하자.
실행 결과 예시를 참고하자.

실행 결과 예시
학생수를 입력하세요:3
1번 학생의 성적을 입력하세요:
국어 점수:10
영어 점수:20
수학 점수:30
2번 학생의 성적을 입력하세요:
국어 점수:10
영어 점수:10


수학 점수:10
3번 학생의 성적을 입력하세요:
국어 점수:20
영어 점수:20
수학 점수:20
1번 학생의 총점: 60, 평균: 20.0
2번 학생의 총점: 30, 평균: 10.0
3번 학생의 총점: 60, 평균: 20.0
 */
public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int numberOfStudents = scanner.nextInt();
        int[][] score = new int[numberOfStudents][3];

        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < score.length; i++) {
            System.out.println(i + 1 + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < score[0].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                score[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < score.length; i++) {
            int total = Arrays.stream(score[i]).sum();
            double avg = Arrays.stream(score[i]).average().getAsDouble();
            System.out.println(i + 1 + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
