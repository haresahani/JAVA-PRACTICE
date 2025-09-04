package recursion;

public class FirstOccurence {
    public static int firstOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
}
