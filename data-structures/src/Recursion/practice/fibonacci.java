package Recursion.practice;

public class fibonacci {

    public static int printFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i<= 10; i++) {
            System.out.println(printFibonacci(i));
        }
    }
}
