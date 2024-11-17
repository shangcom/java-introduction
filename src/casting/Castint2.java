package casting;

public class Castint2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue;

//        intValue = doubleValue; // 범위 큰 타입을 작은 타입에 대입 못한다.
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue); // 소수점 아래는 버려진다.
        System.out.println("doubleValue = " + doubleValue); // 원본은 그대로. 읽은 값을 변환한다.

        int z = (int) 10.5;
        System.out.println((int) 10.5);
    }
}
