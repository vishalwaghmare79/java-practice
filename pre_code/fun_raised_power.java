import java.util.Scanner;

public class fun_raised_power {
    public static int funPower(int x,int n){
        int power = 1;
        for (int i=1;i<=n;i++){
            power = power * x;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(funPower(x,n));
    }
}
