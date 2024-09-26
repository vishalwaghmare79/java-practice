package Recursion;

public class fibonacci {
    public static int fibonacciFunc(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        return fibonacciFunc(n- 1) + fibonacciFunc(n - 2);
    }
    public static void main(String[] args) {
//        int n = 7;
        for (int i = 0; i <= 10; i++) {
        System.out.println( fibonacciFunc(i));
        }
    }
}
