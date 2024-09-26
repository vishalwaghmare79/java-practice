import java.util.Scanner;

public class findScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter your marks");
            int marks = sc.nextInt();
            if (90 <= marks) {
                System.out.println("good");
            } else if (90 >= marks && 60 <= marks) {
                System.out.println("this is also good");
            } else if (50 >= marks && 0 <= marks) {
                System.out.println("this is good as well");
            } else {
                System.out.println("invalid input");
            }
            System.out.println("if you want to continue, press 1");
            n = sc.nextInt();
        } while (n != 0);
    }
}
