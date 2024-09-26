package fuction_method;

import java.util.Scanner;

public class add_function {

    public static int addNum(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("two number of sum is : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        addNum(num1, num2);
    }
}
