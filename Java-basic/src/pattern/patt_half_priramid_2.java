package pattern;

import java.util.Scanner;

public class patt_half_priramid_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        for (int i= 1; i<= num; i++){
            for (int j= num-i; j>= 1; j--){
                System.out.print("  ");
            }
            for (int j= 1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
