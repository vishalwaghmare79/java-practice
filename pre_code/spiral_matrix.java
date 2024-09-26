import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;

        while (colStart <= colEnd && rowStart <= colEnd){
            //colstart->colend = rowstart,colstart->colend;
            for (int col=colStart;col<=colEnd;col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;

            //rowstart->rowend = rowstart->rowend,colend;
            for (int row=rowStart;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;

            //colend->colstart = rowend,colend->colstart;
            for (int col=colEnd;col>=colStart;col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;

            //rowend->rowstart = colstart,rowend->rostart;
            for (int row=rowEnd;row>=rowStart;row--){
                System.out.print(matrix[row][colStart]+" ");
            }
            colStart++;
        }
    }
}