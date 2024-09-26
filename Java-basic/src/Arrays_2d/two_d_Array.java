package Arrays_2d;

import java.util.Scanner;

public class two_d_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row size");
        int row = sc.nextInt();
        System.out.println("enter the col size");
        int col = sc.nextInt();

        int arrys[][] = new int[row][col];

        for (int i= 0; i< row; i++) {
            for (int j= 0 ; j< col; j++) {
                System.out.println("enter the number for : " +i+","+j);
                arrys[i][j] = sc.nextInt();
            }
        }
        for (int i= 0; i < row; i++) {
            for (int j= 0 ; j < col; j++) {
                System.out.print(arrys[i][j]);
            }
            System.out.println();
        }

    }
}
