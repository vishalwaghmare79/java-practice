package Recursion.practice;

public class alphaPrint {
    public static void main(String[] args) {
        int x=65;
        int n=4;


        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= i - (i -1); j--) {
                System.out.print((char)(x+j-1)+" ");
            }
            System.out.println();
        }
    }
}
