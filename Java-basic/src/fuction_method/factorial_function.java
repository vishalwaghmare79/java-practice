package fuction_method;

import java.util.Scanner;

public class factorial_function {
    public static int factoNum(int n){
        int factorial = 1;
        for (int i= 1; i<= n; i++){
            factorial *= i;
        }
        System.out.println("factorial number is : "+ factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int num = sc.nextInt();

        factoNum(num);
    }
}
