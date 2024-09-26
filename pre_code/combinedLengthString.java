import java.util.Scanner;

public class combinedLengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];
        int totalLength = 0;

        for (int i=0;i<size;i++){
            name[i] = sc.next();
            totalLength += name[i].length();
        }
        System.out.println(totalLength);
    }
}
