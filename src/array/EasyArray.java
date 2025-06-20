package array;

public class EasyArray {

    //second largest element
    public static int seccondLargestEle(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > first) {
                second = first;
                first = nums[i];
            } else  if(nums[i] != first && nums[i] > second) {
                second = nums[i];
            }
        }
        return second;
    }

    //Largest
    public static int largestEle(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    //Binary Search
    public static int binaryS(int[] nums, int key) {
        int first = 0;
        int last = nums.length-1;

        while(first <= last) {
            int mid = (first + last) / 2;

            if(nums[mid] == key) {
                return mid;
            }

            if(nums[mid] < key) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return -1;
    }

    //reverse an array
    public static void reverseArray(int[] nums) {
        int first = 0;
        int last = nums.length-1;
        while(first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }

    }

    //pairs in an array
    public static void paris(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
    }

    //subarrays
    public static void subarrays(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j= i; j<nums.length; j++) {
//                System.out.print(j+" ");
                for(int k=i; k<=j; k++) {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //Max subarray sum - Kadan's Algorithm
    public static int maxSubarray(int[] nums) {
        /* Kadan's Rule:
        +ve + +ve = +ve
        Big +ve + small -Ve = +ve
        small +ve + big -ve = -ve(0)
        */
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i : nums) {
            currSum += i;
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;

    }

    //Trapping Rainwater
    public static int trapRainwater(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int trapWater = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax ) {
                    leftMax = height[left];
                } else {
                    trapWater += leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax ) {
                    rightMax = height[right];
                } else {
                    trapWater += rightMax - height[right];
                }
                right--;
            }
        }
        return trapWater;
    }

//    buy and sell stock
    public static int buySellStock(int[] prices) {
        int buyDay = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            if(buyDay > prices[i]) {
                buyDay = prices[i];
            } else {
                int profit = prices[i] - buyDay;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static boolean appearsTwice(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] == nums[j]) {
                return true;
            }
        }
        return false;
    }

    //Maximum Product Subarray
    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSofar = nums[0];
        int globalMax = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSofar;
                minSofar = temp;
            }
            maxSoFar = Math.max(nums[i], nums[i]*maxSoFar);
            minSofar = Math.min(nums[i], nums[i]*minSofar);
            globalMax = Math.max(maxSoFar, globalMax);

        }
        return globalMax;
    }



    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
