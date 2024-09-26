package Recursion.practice;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = (num * 2) -1;

        int matrix[][] = new int[n][n];

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n -1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // top row
            for (int col= colStart; col<= colEnd; col++){
                matrix[rowStart][col] = num;
            }
            rowStart++;

            // right row
            for (int row= rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num;
            }
            colEnd--;

            // bottom row
            for (int col= colEnd; col >= colStart; col--) {
                matrix[rowEnd][col] = num;
            }
            rowEnd--;

            // left row
            for (int row = rowEnd; row >= rowStart; row--) {
                matrix[row][colStart] = num;
            }
            colStart++;
            num--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j< n; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
