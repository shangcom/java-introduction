package array;

public class Array1Ref1 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수 = " + students[0]);
        System.out.println("학생2 점수 = " + students[1]);
        System.out.println("학생3 점수 = " + students[2]);
        System.out.println("학생4 점수 = " + students[3]);
        System.out.println("학생5 점수 = " + students[4]);

        String[] names;
        names = new String[5];
        names[0] = "a";
        names[1] = "b";
        names[2] = "c";
        names[3] = "d";
        names[4] = "e";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        boolean[] tf;
        tf = new boolean[2];
        tf[0] = true;
        tf[1] = false;
        System.out.println(tf[0]);
        System.out.println(tf[1]);

        tf[0] = false;
        System.out.println(tf[0]);
    }
}
