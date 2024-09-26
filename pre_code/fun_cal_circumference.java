import java.util.Scanner;

public class fun_cal_circumference {
    public static double circum_circle(int r){
        double circumference = 2 * 3.14 * r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(circum_circle(r));
    }
}
