package array;

public class EasyArray {
    //Linear search
    public static int linearS(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target) {
                return i;
            }
        }
        return -1;
    }

    //Binary search
    public static int binaryS(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //largest in array
    public static int largestElement (int[] nums) {
        int large = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > large) {
                large = nums[i];
            }
        }
        return large;
    }

    //reverse an array
    public static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        for(int i=0; i<nums.length; i++) {
            if(nums[left] < nums[right]) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
                right--;
            }
        }
    }

    //pairs in array
    public static void pairsArray(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                System.out.print("("+nums[i]+","+nums[j] + ") ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Max subarray
    public static void maxSubarray(int[] nums) {
       for(int i=0; i<nums.length; i++) {
           for(int j=i; j<nums.length; j++) {
               for(int k=i; k<=j; k++) {
                   System.out.print(nums[k]+" ");
               }
               System.out.println();
           }
           System.out.println();
       }
    }

    //maxsubarray sum
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i : nums) {
            currSum += i;
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    //trapping rain water
    public static int trappingWater(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while(left < right) {
            if(heights[left] < heights[right]) {
                if(heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    trappedWater += leftMax - heights[left];
                }
                left++;
            } else {
                if(heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    trappedWater += rightMax - heights[right];
                }
                right--;
            }
        }
        return trappedWater;
    }

    //find second largest element
    public static int secondLargest(int[] nums) {
        int secondLargest = Integer.MIN_VALUE;
        int firstLargest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            } else if(nums[i] != firstLargest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    //check if array is sorted
    public static boolean checkSorted(int[] nums) {
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }

    //Remove duplicates from sorted array
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    //left rotate an array by one
    public static void leftRotate(int[] nums) {
        int temp = nums[0];
        for(int i=0; i<nums.length-1; i++) {
           nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }

    //Move All Zeros to End
     public static void moveAllZeros(int[] nums) {
        int nonZeros = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                 nums[nonZeros] = nums[i];
                nonZeros++;
            }
        }
        for(int i = nonZeros; i<nums.length; i++) {
            nums[i] = 0;
        }
     }

     //find single numbers
    public static int singleN(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    //find second largest
    public static int secondLagesttt(int[] nums) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            } else if(nums[i] != firstLargest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 4, 7};
    System.out.println(secondLagesttt(nums));
    }
}
