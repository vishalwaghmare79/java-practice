import java.util.Scanner;
public class fun_mul {

    public static int mul_twono(int n1,int n2){
        return n1*n2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(mul_twono(num1,num2));
    }
}
