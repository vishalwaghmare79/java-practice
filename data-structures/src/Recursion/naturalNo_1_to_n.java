package Recursion;

public class naturalNo_1_to_n {
    public static void printIncresing(int n) {
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncresing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printIncresing(n);
    }
}
