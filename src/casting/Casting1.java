package casting;

public class Casting1 {
    public static void main(String[] args) {
        /*
        작은 범위 -> 큰 범위 대입 허용.
        자동 형변환.
         */
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
//        longValue = (long) intValue;

        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
//        doubleValue = (double) intValue;
        System.out.println("longValue = " + doubleValue);

        doubleValue = 20000000000L;
//        doubleValue = (double) 20000000000L;
        System.out.println("doubleValue = " + doubleValue);
    }

}