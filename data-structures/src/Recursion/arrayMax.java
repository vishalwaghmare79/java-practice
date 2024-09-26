package Recursion;

public class arrayMax {

    public static int arrayPrintMax(int arr[], int i) {
        if (arr.length-1 == i) {
            return arr[i];
        }

        int tempMax = arrayPrintMax(arr, i+1);
        return Math.max(tempMax, arr[i]);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 7, 8};
        int idx = 0;

        System.out.println(arrayPrintMax(arr, idx));
    }
}
