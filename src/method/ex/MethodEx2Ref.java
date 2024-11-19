package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        printMessage(3, "Hello world!");
        printMessage(5, "Hello world!");
        printMessage(7, "Hello world!");

    }

    public static void printMessage(int times, String message) {

        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
