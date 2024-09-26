package Recursion;

public class countDigit {
    public static int countDigits(int n) {

        if (n >= 0 && n <= 9){
            return 1;
        }

        return 1 + countDigits(n/10);

    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println(countDigits(n));
    }
}
