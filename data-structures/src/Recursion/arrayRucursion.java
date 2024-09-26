package Recursion;

public class arrayRucursion {

    public static void arrayPrint(int arr[], int i) {
        if (arr.length == i) {
            return;
        }
        System.out.print(arr[i]+ ",  ");
        arrayPrint(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 8, 3};
        int idx = 0;
        arrayPrint(arr, idx);
    }
}
