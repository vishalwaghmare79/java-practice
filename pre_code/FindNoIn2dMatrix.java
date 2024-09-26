import java.util.Scanner;

public class FindNoIn2dMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int numbers[][] = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("search location for number");
        int x = sc.nextInt();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (x == numbers[i][j]){
                    System.out.println(x +" number store in "+(i+","+j)+" this location");
                }
            }
        }
    }
}
