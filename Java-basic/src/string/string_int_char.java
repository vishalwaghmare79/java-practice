package string;

import java.util.Scanner;

public class string_int_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "abc";
//        str += "xyz";
//        str += 'r';
//        str += 10;
        System.out.println("abc" + 10 + 20);  // abc1020
        System.out.println("abc" +( 10 + 20 ));  //abc30
    }
}
