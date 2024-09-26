package Sort;

class insertionSort{
    public static void main(String[] args) {
        int arr[] = {7, 4, 3, 8, 2};

        for (int i= 1; i< arr.length; i++){
            int currant = arr[i];
            int j = i - 1;
            while ( j >= 0 && currant < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currant;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
