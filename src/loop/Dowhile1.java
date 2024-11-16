package loop;

/*
 * do-while문
 *  최초 한번은 코드 블럭을 꼭 실행해야 하는 경우
 */
public class Dowhile1 {
    public static void main(String[] args) {

        int i = 10;

        // do 블럭 일단 1번 실행
        do {
            System.out.println("현재 숫자 : " + i);
        } while (i < 3); // 조건식 거짓.
        // 반복문 빠져나온다.
    }
}
