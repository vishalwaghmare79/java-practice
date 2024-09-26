package pattern;

import java.util.Scanner;

public class patt_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row for rectangle");
        int num = sc.nextInt();
        System.out.println("Enter the no of column for rectangle");
        int num1 = sc.nextInt();

        for (int i= 1;i<= num1;i++){
            for (int j= 1;j<= num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
