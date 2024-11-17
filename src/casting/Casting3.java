package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647; // int 최고값;
//        long maxIntOver = 2147483648; // int 최고값 + 1. 리터럴은 기본이 int인데 최대값 넘어가면 L 붙여야 한다.
        long maxIntOver = 2147483648L; // int 최고값 + 1;
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("intValue = " + intValue);

        /*
        오버플로우 발생.
        명시적 캐스팅은 개발자의 책임을 강조하는 철학을 반영.
        의도적인 동작일 것이라고 가정하기 때문에 컴파일 에러가 발생하지 않는다.
         */
        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);

    }
}
