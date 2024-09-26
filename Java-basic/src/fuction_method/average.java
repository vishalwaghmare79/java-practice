package fuction_method;

import java.util.Scanner;

public class average {

    public static int aveFunction(int n1, int n2, int n3){
        int Avg = (n1 + n2 + n3) / 3;
        return Avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int val = aveFunction(num1, num2, num3);
        System.out.println("three numbers average : " + val);

    }
}
