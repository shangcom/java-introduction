package array;

public class ArrayDi2 {
    public static void main(String[] args) {

        // 2X3 2차원 배열
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row <= arr.length - 1; row++) {
            for (int column = 0; column <= arr[0].length - 1; column++) {
                System.out.print(arr[row][column]);
                System.out.print((column < arr[0].length - 1) ? ", " : "\n");
            }
        }

        for (int[] row : arr) { // 행(row)을 순회
            for (int i = 0; i < row.length; i++) { // 각 행의 열(column) 순회
                System.out.print(row[i]);
                System.out.print((i < row.length - 1) ? ", " : "\n"); // 마지막이 아닌 경우 쉼표 추가
            }
        }

    }
}
