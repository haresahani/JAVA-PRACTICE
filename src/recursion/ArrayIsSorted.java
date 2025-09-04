package recursion;

public class ArrayIsSorted {
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return arr[i] <= arr[i+1];
    }
}
