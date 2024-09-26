package Recursion.practice;

public class reversNaturalNo {

    public static void printNaturalNO(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNaturalNO(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNaturalNO(n);
    }
}
