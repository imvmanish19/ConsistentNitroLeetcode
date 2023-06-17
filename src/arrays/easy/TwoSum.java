package arrays.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** https://leetcode.com/problems/two-sum/description/ **/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] sum = twoSum(nums, target);
        System.out.println(Arrays.toString(sum));
    }

    /** Brute Force **/
//    public int[] twoSum(int[] nums, int target) {
//        int[] sumIndices = new int[2];
//        for(int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++) {
//                if(nums[i] + nums[j] == target) {
//                    sumIndices[0] = i;
//                    sumIndices[1] = j;
//                    break;
//                }
//            }
//        }
//        return sumIndices;
//    }

    /** Optimized Approach **/
    public static int[] twoSum(int[] nums, int target) {
        int[] sumIndices = new int[2];
        Map<Integer, Integer> elementMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            elementMap.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++) {
            int value = target - nums[i];
            if(elementMap.containsKey(value) && elementMap.get(value) != i) {
                sumIndices[0] = i;
                sumIndices[1] = elementMap.get(value);
                break;
            }
        }
        return sumIndices;
    }

    /** Check before approach **/
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numToIndex = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (numToIndex.containsKey(target - nums[i])) {
//                return new int[] {numToIndex.get(target - nums[i]), i};
//            }
//            numToIndex.put(nums[i], i);
//        }
//        return new int[] {};
//    }

    /** Two Pointers **/
//    public static boolean twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
//        int start = 0;
//        int end = nums.length - 1;
//        while(start < end) {
//            int sum = nums[start] + nums[end];
//            if(sum == target) {
//                return true;
//            } else if(sum < target) {
//                start++;
//            } else {
//                end--;
//            }
//        }
//        return false;
//    }
}
