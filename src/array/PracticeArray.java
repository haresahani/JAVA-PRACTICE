package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PracticeArray {
//    public static int linearSearch(int arr[], int target) {
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int largest(int arr[]) {
//        int largest = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }

//    public static int binaryS(int arr[], int target) {
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start < end) {
//            int mid = start + (end - start) /2;
//            if(arr[mid] == target) {
//                return mid;
//            }
//
//            if(mid < target) {
//                end = mid-1;
//            } else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }

//    public static void reverse(int arr[]) {
//        int left = 0;
//        int right = arr.length-1;
//        while(left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//    }

//    public static void pairs(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                System.out.print("("+arr[i]+","+arr[j]+")");
//            }
//            System.out.println();
//        }
//    }

//    public static void subArrays(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i; j<arr.length; j++) {
//                for(int k=i; k<=j; k++) {
//                    System.out.print(arr[k]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }

    //max subarray sum - brute force
    public static int maxSubarraySum(int[] arr) {
        int maxSum =
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        int target = 1;
//        System.out.println(linearSearch(arr, target));
//        System.out.println(largest(arr));
//        System.out.println(binaryS(arr, target));
//        pairs(arr);
        subArrays(arr);
    }
}
