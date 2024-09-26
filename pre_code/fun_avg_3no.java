import java.util.Scanner;

public class fun_avg_3no {
    public static int funAvg(int a,int b,int c){
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("avg is :"+funAvg(num1,num2,num3));
    }
}
