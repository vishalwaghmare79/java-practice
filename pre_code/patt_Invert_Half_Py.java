public class patt_Invert_Half_Py {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(num);
            }
            System.out.println();
            num++;
        }
    }
}
