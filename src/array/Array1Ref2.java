package array;

public class Array1Ref2 {
    public static void main(String[] args) {

        int[] students = new int[5];

        for (int i = 0; i <= students.length - 1; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i <= students.length - 1; i++) {
            System.out.println("students[" + i + "] = " + students[i]);
        }


    }
}
