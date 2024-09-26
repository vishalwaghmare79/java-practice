import java.util.Scanner;

public class fun_fibonacci {
    public  static int fun_cal_fibonacci(int n){
        int fibonacci = 1;
        for (int i=n;i>=1;i--){
            fibonacci = fibonacci * i;
        }
        return fibonacci;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fun_cal_fibonacci(n));
    }
}
