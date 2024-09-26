package Recursion;

import java.util.Scanner;

public class rev_string {
    // abcd
    static String revString(String str){
        if (str.length() == 0) return str;
        return revString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        String rev = revString(str);
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("String is palimdrom");
        } else {
            System.out.println("String is not palimdrom");
        }
    }
}
