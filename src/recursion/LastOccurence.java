package recursion;

public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }

        int isFound = lastOcc(arr, key, i+1);

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}
