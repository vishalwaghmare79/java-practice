import java.util.Scanner;

public class audlt_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("you are child");
        } else if (age > 18 & age < 50) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are old");
        }
    }
}
