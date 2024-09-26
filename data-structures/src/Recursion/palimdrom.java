package Recursion;

import java.util.Scanner;

public class palimdrom {
    static boolean isPalimdrom(String str, int l, int r) {
        if (l >= r) return true;
        return (str.charAt(l) == str.charAt(r) && isPalimdrom(str, l+1, r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = isPalimdrom(str, 0, str.length() - 1);
        System.out.println("is String palimdrom: "+ ans);
    }
}
