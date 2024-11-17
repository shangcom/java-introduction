package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = 0; // if 블럭에서만 사용됨.ㅉ
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
//        System.out.println("temp = " + temp); // temp 사용 불가.
    }
}
