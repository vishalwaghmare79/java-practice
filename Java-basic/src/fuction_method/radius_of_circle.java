package fuction_method;

import java.util.Scanner;

public class radius_of_circle {

    public static double circumFerence(int r){
        double circum = (2 * 3.14) * r;
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the radius of circle");
        int radius = sc.nextInt();

        double val = circumFerence(radius);
        System.out.println("circumference of a circle is : " + val);

    }
}
