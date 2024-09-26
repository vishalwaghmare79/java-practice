import java.util.Scanner;

public class fun_table_no {
    public static void fun_Table(int n){
        int num = 10;
        for (int i=1;i<=num;i++){
            int table = n * i;
            System.out.println(n+" x "+i+" = "+table);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fun_Table(n);
    }
}
