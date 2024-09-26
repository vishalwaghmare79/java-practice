package string;

import java.util.Scanner;

public class delete_string_part {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String email = sc.next();
        String filter = "";

        for (int i= 0; i< email.length(); i++){

            if (email.charAt(i) == '@'){
                break;
            }
            filter += email.charAt(i);
        }
        System.out.println(filter);
    }
}
