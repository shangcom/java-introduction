package cond;

/*
조건이 참 / 거짓이냐에 따라 변수값 달라지는 단순한 경우,
삼항연산자 '?:'를 사용한다.
(조건) ? 조건이 참일 때 반환값 : 조건이 거짓일 때 반환값

삼항 연산자는 식(expression, 값을 반환하는 코드)으로 작동하며, 값을 반환하기 때문에 변수 대입, 출력, 계산식 등 다양한 위치에서 사용할 수 있음.
 */
public class CondOp1 {
    public static void main(String[] args) {

        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + ", status = " + status);
    }
}
