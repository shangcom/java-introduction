package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        int[][] arr = new int[5][7];

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int[] row : arr) {
            for (int column = 0; column < row.length; column++) {
                System.out.print(row[column]);
                System.out.print((column < row.length-1)? ", " : "\n");
            }
        }
    }
}
