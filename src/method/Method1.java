package method;

public class Method1 {
    
    public static void main(String[] args) {

        //계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력:" + sum1);

        add(a, b);

        //계산2
        int x = 10;
        int y = 20;
        System.out.println(x + "+" + y + " 연산 수행");


        int sum2 = x + y;
        System.out.println("결과2 출력:" + sum2);

        add(x, y);
    }

    public static void add(int a, int b) {
        int sum = a+b;
        System.out.println(a + "+" + b + " 연산 수행");
        System.out.println("결과 출력: " + sum);
    }
}
