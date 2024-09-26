import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        for (int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        for (int j=0;j< marks.length;j++){
            System.out.println(marks[j]);
        }
    }
}
