import java.util.Scanner;

public class fun_vote {
    public static void calAge(int num){
        if (num>=18){
            System.out.println("you are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        calAge(age);
    }
}
