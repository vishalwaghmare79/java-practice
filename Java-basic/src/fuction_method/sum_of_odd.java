package fuction_method;

import java.util.Scanner;

public class sum_of_odd {

    public static int sumOddFunction(int n){
        int sum = 0;
        for (int i= 1; i<= n; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        int val = sumOddFunction(num);
        System.out.println("sum of odd number 1 to n : " + val);

    }
}
