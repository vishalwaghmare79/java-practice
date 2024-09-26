package string;

import java.util.Scanner;

public class mul_string_length_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        String str[] = new String[size];

        for (int i= 0; i< size; i++){
            str[i] = sc.next();
            count += str[i].length();
        }

        System.out.println("total length of all String : " + count);
    }
}
