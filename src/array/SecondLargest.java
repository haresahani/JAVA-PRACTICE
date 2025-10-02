package array;

public class SecondLargest {
    public static int secondLarge(int[] arr) {
        int firstLargestSoFar = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > firstLargestSoFar) {
                secondLargest = firstLargestSoFar;
                firstLargestSoFar = arr[i];
            }

            if(arr[i] != firstLargestSoFar && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLarge(arr));
    }
}
