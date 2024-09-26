package Recursion.practice;

public class gcd {

    public static int pGcd(int x, int y) {
        // x = 24 y = 15
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int printGcd(int n, int m) {
        if (m == 0) return n;
        return printGcd(m, n % m);
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 24;

        System.out.println(pGcd(x, y));
        System.out.println(printGcd(x, y));
    }
}
