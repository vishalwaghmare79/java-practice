package pattern;

import java.util.Scanner;

public class patt_rev_half_priramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        for (int i= 1; i<= num; i++){
            for (int j= num; j>= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
