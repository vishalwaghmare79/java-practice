package Arrays_2d;

import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row size");
        int row = sc.nextInt();
        System.out.println("enter the col size");
        int col = sc.nextInt();

        int arrays[][] = new int[row][col];

        for(int i= 0; i< row; i++){
            for (int j= 0; j< col; j++){
                arrays[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the x number");
        int x = sc.nextInt();
        for(int i= 0; i< row; i++){
            for (int j= 0; j< col; j++){
                if(arrays[i][j] == x){
                    System.out.println("number x index of : " + i+j);
                }
            }
        }
    }
}
