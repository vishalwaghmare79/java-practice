package Arrays;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter how many subjects");
        int size = sc.nextInt();
        int [] marks = new int[size];
        String[] subjects = new String[size];

        for (int i= 0; i< size; i++){
            System.out.println("enter your subject name");
            subjects[i] = sc.next();
            System.out.println("enter your marks");
            marks[i] = sc.nextInt();
        }
        for (int i= 0; i< size; i++){
            System.out.println(subjects[i] + " : " + marks[i]);
        }
    }
}
