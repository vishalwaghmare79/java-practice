package Recursion.practice;

public class naturalNo {
    public static void printNaturalNO(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printNaturalNO(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNaturalNO(n);
    }
}
