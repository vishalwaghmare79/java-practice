package Recursion.practice;

public class powerFun {

    public static int printPower(int p, int q) {
        if (q == 0) {
            return 1;
        }

        int smallans = printPower(p, q/2);
        if (q % 2 == 0) {
            return smallans * smallans;
        }
        return p * smallans * smallans;
    }

    public static void main(String[] args) {
        int p = 5;
        int q = 2;

        System.out.println(printPower(p, q));
    }
}
