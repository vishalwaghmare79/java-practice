import java.util.Scanner;

public class ShortingMatrixs {
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

        for (int i=0;i<row-1;i++){
            for (int j=0;j<col-1;j++){
                if (numbers[i][j] > numbers[i+1][j+1]){
                    numbers[i+1][j+1] = numbers[i][j];
                    System.out.print(numbers[i][j]);
                }
            }
            System.out.println();
        }
    }
}
