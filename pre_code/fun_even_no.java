import java.util.Scanner;

public class fun_even_no {
    public static void fun_even(int num){
        if (num % 2 == 0){
            System.out.println("no is even");
        }else {
            System.out.println("no is not even");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fun_even(n);
    }
}
