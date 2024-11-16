package cond;

public class If3 {
    public static void main(String[] args) {

        /*
        if문 연달아 사용하면 서로 별개의 조건식이다.
        앞뒤 조건문이 서로 관계가 없으므로 모든 조건실을 실행한다.
        age가 7 이하일 경우, 첫번째 이후의 if문들은 전혀 만족하지 않음을 예상할 수 있다.
        그럼에도 실행된다.
        즉, 불필요한 조검 검사가 계속된다.

        이런 경우, 조건식들을 묶어주는 else if를 사용해야 한다.
         */
        int age = 5;
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
    }
}
