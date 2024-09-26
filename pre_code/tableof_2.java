import java.util.Scanner;
public class tableof_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table;

        for (int i= 1; i<=10; i++){
            table = n * i;
            System.out.println(n+" * "+ i +" = "+ table);
        }
    }
}
