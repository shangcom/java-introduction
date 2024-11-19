package method;

public class MethodCasting1 {
    public static void main(String[] args) {

        double number = 1.5;

        /*
         printNumber()는 매개변수로 int 타입을 받는다.
         double이 더 커서 자동 형변환이 되지 않는다.
         따라서 number를 인자로 전달하기 위해서는 명시적 형변환(casting)이 필요하다.
         */
//        printNumber(number);
        printNumber((int) number);

    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
