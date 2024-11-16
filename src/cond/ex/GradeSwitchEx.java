package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {

        String grade = "F";
        String a = "탁월한 성과입니다!";
        String b =  "좋은 성과입니다!";
        String c =  "준수한 성과입니다!";
        String d = "향상이 필요합니다.";
        String f =  "불합격입니다.";
        String etc =  "잘못된 학점입니다.";

        switch (grade) {
            case "A" -> System.out.println(a);
            case "B" -> System.out.println(b);
            case "C" -> System.out.println(c);
            case "D" -> System.out.println(d);
            case "F" -> System.out.println(f);
            default -> System.out.println(etc);

        }
    }
}
