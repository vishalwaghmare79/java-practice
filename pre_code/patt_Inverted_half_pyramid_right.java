public class patt_Inverted_half_pyramid_right {
    public static void main(String[] args) {
        int n = 4;

        for (int i=1;i<=n;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
