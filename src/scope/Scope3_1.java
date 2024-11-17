package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // if 블럭에서만 사용됨. 스코프가 쓸데없이 넓다.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
        System.out.println("temp = " + temp); // 아직 살아있음.
    }
}
