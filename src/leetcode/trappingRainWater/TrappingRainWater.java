package leetcode.trappingRainWater;

public class TrappingRainWater {
    public static int trappwater(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int totalTrapWater = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalTrapWater += leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalTrapWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalTrapWater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappwater(height));
    }
}
