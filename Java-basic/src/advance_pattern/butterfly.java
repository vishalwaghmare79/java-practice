package advance_pattern;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        System.out.println("Enter number of stars to be reflected in pattern");
        n=sc.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             for(int j=i+1;j<=n;j++){
                 System.out.print(" ");
             }
             for(int j=i+1;j<=n;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         n=n-1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}