public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int fibonacci = 0;

        for (int i=0;i<n;i++){

            fibonacci = a + b;
            b = a;
            a = fibonacci;

            System.out.println(b);
        }
    }
}