package Recursion;

public class find_idx_arr {

    public static int get_last_idx(int arr[], int x, int idx) {
        if (0 > idx) return -1;
        if (arr[idx] == x) return idx;
        return get_last_idx(arr, x, idx - 1);
    }

    public static void all_idx(int arr[], int n, int x, int idx) {
        if (n <= idx) return;
        if (x == arr[idx]) {
            System.out.print(idx + " ");
        }

        all_idx(arr, n, x, idx + 1);
    }
    public static int get_idx(int arr[], int n, int x, int idx) {
        if (n <= idx) return -1;
        if (x == arr[idx]) return idx;
        return get_idx(arr, n, x, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 6, 4, 7};
        int x = 7;
        int idx = 0;
//        System.out.print("all numbers indexes are : ");

        System.out.println(get_last_idx(arr, x, arr.length-1));
//        all_idx(arr, arr.length, x , idx);
//        System.out.println("number found at index : "+get_idx(arr, arr.length, x, idx));
    }
}
