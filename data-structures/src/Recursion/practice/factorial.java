package Recursion.practice;

public class factorial {

    public static int printFactorial(int n) {
        if (n == 1) return n;

        return printFactorial(n-1) * n;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(printFactorial(n));
    }
}
