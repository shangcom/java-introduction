package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        average(1, 2, 3);
        average(15, 25, 35);
    }

    public static void average(int a, int b, int c) {
        int sum = a + b + c;
        double avg = (double) sum / 3;
        System.out.println("평균값: " + avg);
    }
}
