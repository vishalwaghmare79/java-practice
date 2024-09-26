package fuction_method;

import java.util.Scanner;

public class num_campare {

    public static void numCamp(int n1, int n2){
       System.out.println(n1 > n2 ? "number 1 is grater" :"number 2 is grater");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        numCamp(num1, num2);

    }
}
