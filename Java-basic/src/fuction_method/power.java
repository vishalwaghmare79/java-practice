package fuction_method;

import java.util.Scanner;

public class power {

    public static void numPower(int n){
        int power = 1;
        for (int i= 1; i<= n; i++){
            power = power * n;
        }
        System.out.println(power);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        numPower(num);
    }
}
