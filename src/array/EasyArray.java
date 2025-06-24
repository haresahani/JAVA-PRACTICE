package array;

public class EasyArray {
    public static void subArrays(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<=nums.length; j++) {
                for(int k=i; k<j; k++) {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
//            System.out.println();
        }
    }

    //pairs in array
    public static void pairsArray(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                System.out.print(nums[i] + "," + nums[j] +" ");
            }
            System.out.println();
        }
    }

    //reverse an array
    public static void reverse(int[] nums) {
        int i = 0;
        int k = 0;
        for(int j=1; j<nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            i++;
            k++;
        }
        System.out.println(nums[i]+ " "+nums[k]);
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5};
//        subArrays(nums);
//        pairsArray(nums);
        reverse(nums);
    }
}
