import java.util.Scanner;

public class fun_check_pirme {

    public static int fun_Pirme(int num){
        int count = 0;
        for (int i=1;i<=num;i++){
            if (i % 2 == 0 ){
                count++;
            }
        } if (count == 2){
            System.out.println("no is pirme");
        }else {
            System.out.println("no is not pirme");
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fun_Pirme(n);
    }
}
