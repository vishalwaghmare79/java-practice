package tricky_question;

import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numbere");
        int n = sc.nextInt();
        int number1 = 0;
        int number2 = 1;
        int fibonnaci = 0;

        System.out.println(number1);
        System.out.println(number2);
        for (int i= 0; i< n-2; i++){
            fibonnaci = number2 + number1;
            System.out.println(fibonnaci);
            number1 = number2;
            number2 = fibonnaci;
        }
    }
}
