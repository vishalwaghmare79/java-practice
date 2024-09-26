package fuction_method;

import java.util.Scanner;

public class printMyName {
    public static void printMyName(String name){
        System.out.println("your name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.nextLine();

        printMyName(name);
    }
}
