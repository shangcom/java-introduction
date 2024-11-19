package method;

public class MethodCasting2 {
    public static void main(String[] args) {

        int number = 100;
        printNumber(number);

        double number2 = 100.5;
        printNumber(number2);

    }

    static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
