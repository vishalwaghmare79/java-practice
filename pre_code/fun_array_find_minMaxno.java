import java.util.Scanner;

public class fun_array_find_minMaxno {
    public static int funMin(int num[]){
        int minimum = num[0];
        for (int i = 0; i < num.length; i++) {
            minimum = Math.min(minimum, num[i]);
        }
        return minimum;
    }
    public static int funMax(int num[]){
        int maximum = num[0];
        for (int i = 0; i < num.length; i++) {
            maximum = Math.max(maximum, num[i]);
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(funMin(numbers));
        System.out.println(funMax(numbers));
    }
}
