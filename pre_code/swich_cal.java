import java.util.Scanner;

public class swich_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result ;
        System.out.println("choose any one op \nadd: 1\nsub: 2");
        int button = sc.nextInt();

        switch (button){
            case 1 :
                result = a + b;
                System.out.println(result);
                break;
            case 2 :
                result = a - b;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
