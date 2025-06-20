package sorting;

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 5, 6, 2, 4, 7, 10, 13, 9};
        selectionSort(nums);
        for(int i : nums) {
            System.out.print(i +" ");
        }
    }
}
