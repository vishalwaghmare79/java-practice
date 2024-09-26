package Recursion;

public class tableTill_k {
    public static void tablePrint_K(int n, int k) {
        if (k >  0) {
            tablePrint_K(n, k-1);
            System.out.println(n * k);
        }
    }

    public static void main(String[] args) {
        int num = 12;
        int k = 5;
        tablePrint_K(num, k);
    }
}
