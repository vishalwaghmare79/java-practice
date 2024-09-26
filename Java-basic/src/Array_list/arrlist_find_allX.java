package Array_list;

import java.util.ArrayList;

public class arrlist_find_allX {

    static ArrayList<Integer> getAllIndex(int arr[], int n, int x, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= n) return ans;
        if (arr[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = getAllIndex(arr, n, x, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 3, 3};
        int x = 3;
        ArrayList<Integer> ans = getAllIndex(arr, arr.length, x, 0);

        for (Integer i: ans) {
            System.out.println(i);
        }
    }
}
