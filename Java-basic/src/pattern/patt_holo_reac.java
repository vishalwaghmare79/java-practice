package pattern;

import java.util.Scanner;

public class patt_holo_reac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int m = sc.nextInt();
        System.out.println("enter the number");
        int n = sc.nextInt();

        for (int i= 0;i<= m;i++){
            for (int j= 0;j<= n;j++){
                if(i==0 || j== 0 || i==m || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
