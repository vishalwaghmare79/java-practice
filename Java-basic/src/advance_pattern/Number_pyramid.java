package advance_pattern;

import java.util.Scanner;

public class Number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        for (int i= 1; i<= num; i++) {
            for (int j=1; j<= num-i; j++) {
                System.out.print(" ");
            }
            for (int j= 1; j<= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
