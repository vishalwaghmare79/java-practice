package Recursion;

public class search_x_arr {
    public static boolean search_x(int arr[], int n,int x, int idx) {
        if (n <= idx) return false;
        if (x == arr[idx]) return true;
        return search_x(arr, n, x, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 2, 9};
        int x = 9;
        int idx = 0;

        if (search_x(arr, arr.length, x, idx)){
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
