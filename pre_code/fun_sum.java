import java.util.*;

public class fun_sum {
    public static int sum_twono(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = sum_twono(num1,num2);

        System.out.println(sum);
    }
}
