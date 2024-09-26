package fuction_method;

import java.util.Scanner;

public class greatest_divisor {

    public static void funDivisor(int n1, int n2){
        int divisor = 1;
        for (int i= 1; i<= n1; i++){
            if (n1 % i == 0 && n2 % i == 0){
                divisor = i;
            }
        }
        System.out.println(divisor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        funDivisor(num1, num2);
    }
}
