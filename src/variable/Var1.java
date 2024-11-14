package variable;

public class Var1 {

    public static void number(int number) {
        for (int i = 0; i <= 2; i++) {
            System.out.println(number);
        }
    }
    public static void main(String[] args){

        System.out.println(10);
        System.out.println(10);
        System.out.println(10);

        int i = 10;

        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        number(20);
    }
}
