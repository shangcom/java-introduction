package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // a를 1 증가시켜 재대입한 뒤 b에 재대입
        b = ++a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // a를 b에 재대입한 뒤 1 증가시켜 재대입
        int c = 1;
        int d = 0;
        d = c++;
        System.out.println("d = " + d);
        System.out.println("c = " + c);
    }

}
