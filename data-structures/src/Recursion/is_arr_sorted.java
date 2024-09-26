package Recursion;

public class is_arr_sorted {
    public static boolean isSorted(int arr[], int n, int idx) {
        if (n <= idx || n <= 1) return true;
        if (arr[idx] > arr[idx + 1]) return false;

        return isSorted(arr, n, idx + 1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 4};
        System.out.println(isSorted(arr, arr.length -1, 0));
    }
}
