package Recursion;

public class powerFun {
    public static int powerFun(int p, int q) {
        if (q == 0) return 1;
        return p * powerFun(p, q-1);
    }
    public static void main(String[] args) {
        int p = 5;
        int q = 2;
        System.out.println(powerFun(p, q));
    }
}
