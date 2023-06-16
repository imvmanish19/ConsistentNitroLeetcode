package arrays.easy;

/** https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/ **/
public class MaximumProductOfTwoElements {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max = computeMaximum(nums);
        System.out.println(max);
    }

    /** BRUTE FORCE **/
//    private static int computeMaximum(int[] nums) {
//        int max = Integer.MIN_VALUE;
//        int indexOne = 0;
//        int indexTwo = 0;
//        for(int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++) {
//                if(nums[i] * nums[j] > max) {
//                    max = nums[i] * nums[j];
//                    indexOne = i;
//                    indexTwo = j;
//                }
//            }
//        }
//        return (nums[indexOne] - 1) * (nums[indexTwo] - 1) ;
//    }

    /** OPTIMISED **/
    private static int computeMaximum(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if(num > secondMax) {
                secondMax = num;
            }
        }
        return (firstMax-1) * (secondMax-1);
    }
}
