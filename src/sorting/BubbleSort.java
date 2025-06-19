package sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}

// Time Complexity = O(n^2)
// Space Complexity = O(1)