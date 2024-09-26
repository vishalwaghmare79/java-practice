package Recursion.practice;

public class sumOfDigit {

    public static int printSum(int n) {
        if (n >= 0 && n <= 9 ) {
            return n;
        }
        return printSum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int n = 323;
        System.out.println(printSum(n));
    }
}
