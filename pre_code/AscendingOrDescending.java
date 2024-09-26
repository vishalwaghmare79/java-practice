import java.util.Scanner;

public class AscendingOrDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return;
        }

        int numbers[] = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > numbers[i - 1]) {
                isDescending = false;
            } else if (numbers[i] < numbers[i - 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("Array sorted in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
