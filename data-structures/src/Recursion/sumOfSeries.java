package Recursion;

public class sumOfSeries {

    static int sumOf_n_No(int n){
        if (n == 0) return 0;
        if (n % 2 != 0) {
            return sumOf_n_No(n - 1) + n;
        }
            return sumOf_n_No(n -1) - n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOf_n_No(n));
    }
}
