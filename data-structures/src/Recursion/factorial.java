package Recursion;
import java.util.*;

public class factorial {
    public static int fact(int n){
        if(n == 1){
            return n;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter input number");
        int input=sc.nextInt();
        System.out.println(fact(input));
    }
    
}
