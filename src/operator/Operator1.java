package operator;

public class Operator1 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int mulit = a * b;
        System.out.println("a * b = " + mulit);

        int div = a / b; // 결과 정수로.
        System.out.println("a / b = " + div);

        int mod = a % b; // 나머지
        System.out.println("a % b = " + mod);
    }
}
