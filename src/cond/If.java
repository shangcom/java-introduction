package cond;

public class If {
    public static void main(String[] args) {

        int age = 20;

        /*
        if : () 안의 조건이 참일 경우 {} 안의 코드를 실행.
        else : else 이전까지 참이 없었을 경우 실행.
         */
        if (age >= 18) {
            System.out.println("성인입니다");
        }
        if (age >= 16){

        }else {
            System.out.println("미성년자입니다");
        }
    }
}
