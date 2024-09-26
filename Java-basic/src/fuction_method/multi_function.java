package fuction_method;

import java.util.Scanner;

public class multi_function {

    public static int returnMulti(int n1, int n2){
        int multi = n1 * n2;
        System.out.println("two number multiphication is : "+ multi);
        return multi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        returnMulti(num1, num2);

    }
}
