package advance_pattern;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        for (int i= 1; i<= num; i++){
            for (int j= 1; j<= num-i; j++){
                System.out.print("  ");
            }

            for (int j= 1; j<= i+(i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i= num-1; i>= 1; i--){
            for (int j= 1; j<= num-i; j++){
                System.out.print("  ");
            }

            for (int j= 1; j<= i+(i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
