package leetcode.trappingRainWater;

public class Main {
    public static int longesstSubarraySum(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;
        while(right < n) {
            while(right <= left && sum > k) {
                left -=
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
    }
}
