package string;

import java.util.Scanner;

public class string_basic {
    public static void main(String[] args) {

        String firstName = "vishal";
        String lastName = "waghmare";
        String fullName = firstName + " " +lastName;
//        System.out.println(fullName.length());

        for(int i=0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
