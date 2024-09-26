import java.util.Scanner;

public class fun_find_greaterno {
    public static void funGreaterNO(int num1,int num2){
        if (num1>=num2){
            System.out.println("num1 is greater than mum2");
        }else {
            System.out.println("num2 is greater than mum1");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        funGreaterNO(a,b);
    }
}
