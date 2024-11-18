package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {

//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total / 5;
//
//        System.out.println("점수 총합: " + total);
//        System.out.println("점수 평균: " + average);

        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }

        double avg = (double) total / students.length;

//        int total = Arrays.stream(students).sum();
//        double avg = Arrays.stream(students).average().getAsDouble();

        System.out.println("total = " + total);
        System.out.println("avg = " + avg);

        int total2 = 0;

        for (int value : students) {
            total2 += value;
        }
        double avg2 = (double) total2 / students.length;

        System.out.println("total2 = " + total2);
        System.out.println("avg2 = " + avg2);
    }
}
