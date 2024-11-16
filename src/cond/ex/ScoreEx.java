package cond.ex;

/*
문제: "학점 계산하기"
학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
90점 이상: "A"
80점 이상 90점 미만: "B"
70점 이상 80점 미만: "C"
60점 이상 70점 미만: "D"
60점 미만: "F"

점수는 변수( int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
 */
public class ScoreEx {
    public static void main(String[] args) {

        int score = 46;
        String grade;

        if (score < 60) {
            grade = "F";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 70 && score < 80) {
            grade = "D";
        } else if (score >= 80 && score < 90) {
            grade = "D";
        } else {
            grade = "A";
        }
        System.out.println("score = " + score + ", grade = " + grade);
    }

}
