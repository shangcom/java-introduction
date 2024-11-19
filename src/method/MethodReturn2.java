package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        checkAge(20);
    }

    /*
     PDF 버전. return 사용해서 메서드 즉시 종료.
     조건을 만족하지 않는 경우, 이후의 코드(성인 메시지 출력)가 실행됨.
     */
    public static void checkAge2(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자입니다.");
            return;
        }
        System.out.println(age + "살, 성인입니다.");
    }

    /*
     내 버전.
     조건을 만족하지 않는 경우, else 블록으로 이동하여 "성인" 메시지를 출력.
     */
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자입니다.");
        } else {
            System.out.println(age + "살, 성인입니다.");
        }
    }
}
