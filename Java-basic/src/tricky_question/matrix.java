package tricky_question;

public class matrix {
    public static void main(String[] args) {
        int n = 5;
        int num = n-1;


        int matrix[][] = new int[n][n];
        int rowStart = 0;
        int colEnd = n - 1;
        int colStart = 0;
        int rowEnd = n - 1;

        int k = 11;
        while (rowStart <= rowEnd && colStart <= colEnd) {


            // colStart to colEnd
            for (int col = colStart; col <= colEnd ; col++) {
                matrix[rowStart][col] = k;
                k++;
            }
            rowStart++;

            // rowStart to rowEnd
            for (int row= rowStart; row<= rowEnd; row++) {
                matrix[row][colEnd] = k;
                k++;
            }
            colEnd--;

            // colEnd to colStart
            for (int col = colEnd; col>= colStart; col--) {
                matrix[rowEnd][col] = k;
                k++;
            }
            rowEnd--;

            // rowEnd to rowStart
            for (int row = rowEnd; row >= rowStart; row--) {
                matrix[row][colStart] = k;
                k++;
            }
            colStart++;

//            num--;
        }

        for (int i = 0; i< n; i++) {
            for (int j = 0; j< n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
