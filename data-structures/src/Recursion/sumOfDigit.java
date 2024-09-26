package Recursion;

public class sumOfDigit {
    public static int sumOfDigits(int n) {
        if (n >=0 && n <= 9) return n;

        return sumOfDigits(n/10) + n%10;
    }

    public static void main(String[] args) {
        int n = 453;
        System.out.println(sumOfDigits(n));
    }
}
