package Arrays;

import java.util.Scanner;

public class number_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of Array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i= 0; i< size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter x number of Array");
        int x = sc.nextInt();
        for (int i= 0; i< size; i++){
            if (numbers[i] == x){
                System.out.println("your x number index at : " + i);
            }
        }
    }
}
