package pattern;

import java.util.Scanner;

public class patt_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();
        int number = 1;

        for (int i= 1; i<= num; i++){
            for (int j= 1; j<= i; j++){
                if (number % 2 != 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                number++;
            }
            System.out.println();
        }
    }
}
