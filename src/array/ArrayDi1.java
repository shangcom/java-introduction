package array;

public class ArrayDi1 {
    public static void main(String[] args) {

        // 2X3 2차원 배열
        int[][] arr = new int[2][3];
        int i = 1;
        for (int row = 0; row <= arr.length - 1; row++) {
            for (int column = 0; column <= arr[0].length - 1; column++) {
                arr[row][column] = i++;
            }
        }

        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.print(arr[0][2]);

        System.out.println();

        System.out.print(arr[1][0]);
        System.out.print(arr[1][1]);
        System.out.print(arr[1][2]);
    }
}
