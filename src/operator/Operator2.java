package operator;

public class Operator2 {
    public static void main(String[] args) {

        String result = "hello " + "world";
        System.out.println("result = " + result);

        /*
        s1, s2는 변수이므로 컴파일 시점에 결합 못하고, 런타임에 StringBuilder 사용해서 새로운 문자열 "string1string2"가 생성된다.
        "string1string2"는 런타임에 동적으로 생성된 문자열이므로 heap 영역에 생성된다.
         */
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);

        String result3 = "a + b = " + 10;
        System.out.println("result3 = " + result3);

        int num = 20;
        String str = "a + b = ";
        String result4 =  str + num;
        System.out.println("result4 = " + result4);
    }
}
