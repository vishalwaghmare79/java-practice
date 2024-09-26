package Recursion;
import java.math.*;
public class is_number_pallimdrom {

    static int isPalimdrom(int n, int reversed) {
        if (n == 0)  return reversed;
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        return isPalimdrom(n / 10, reversed);
    }
    public static void main(String[] args) {
        int n = 131;
        if (n == isPalimdrom(n, 0)){
            System.out.println("number is palimdrom");
        } else {
            System.out.println("number is not palimdrom");
        }
    }
}
