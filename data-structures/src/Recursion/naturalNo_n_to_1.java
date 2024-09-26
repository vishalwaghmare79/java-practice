package Recursion;

public class naturalNo_n_to_1 {
    public static void printDecrese(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecrese(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printDecrese(n);
    }
}
