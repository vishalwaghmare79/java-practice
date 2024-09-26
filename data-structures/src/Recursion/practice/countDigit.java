package Recursion.practice;

public class countDigit {

    public static int printCount(int n) {
        if (n >= 0 && n <= 9) {
            return 1;
        }

        return printCount(n/10) + 1;
    }

    public static void main(String[] args) {
        int n = 347;
        System.out.println(printCount(n));
    }
}
