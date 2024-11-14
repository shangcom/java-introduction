package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;

        /*
        java: variable a might not have been initialized
        컴파일 단계에서 막힌다.
         */
//        System.out.println("a = " + a);

        /*
        초기화 안하고 실행하면, 만들어진 class 파일에는 'int a;'라는 코드 자체가 없어짐. 컴파일러가 최적화해서 안쓰는 변수 없애버림.
         */
//        a = 10;
//        System.out.println("a = " + a);
    }
}
