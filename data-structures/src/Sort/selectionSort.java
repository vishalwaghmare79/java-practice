package Sort;

import java.util.Scanner;

class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int  arr[] = new int[size];

        for (int i= 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i= 0; i< arr.length; i++){
            int smallest = i;
            for (int j= 1 + i; j< arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int i= 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}