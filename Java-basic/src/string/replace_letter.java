package string;

import java.util.Scanner;

public class replace_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any String");
        String str = sc.next();
        String replace = "";

        for (int i= 0; i< str.length(); i++){
            if (str.charAt(i) == 'e'){
                replace += 'i';
            } else {
                replace += str.charAt(i);
            }
        }

        System.out.println(replace);

    }
}
