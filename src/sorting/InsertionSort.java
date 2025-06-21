package sorting;

public class InsertionSort {
    public static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element at its correct position
            arr[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertion(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}
