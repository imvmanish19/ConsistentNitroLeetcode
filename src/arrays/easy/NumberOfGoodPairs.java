package arrays.easy;

import java.util.HashMap;
import java.util.Map;

/** https://leetcode.com/problems/number-of-good-pairs/description/ **/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int numberOfGoodPairs = computeGoodPairs(nums);
        System.out.println(numberOfGoodPairs);
    }

    /** BRUTE FORCE O(n^2) and O(1) **/
//    private static int computeGoodPairs(int[] nums) {
//        int count = 0;
//        for(int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++) {
//                if(nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    /** Optimized Solution: Hashmap Based [O(n) & O(n)] **/
//    private static int computeGoodPairs(int[] nums) {
//        Map<Integer, Integer> freqCounter = new HashMap<>();
//        for(int i=0;i<nums.length;i++) {
//            if(!freqCounter.containsKey(nums[i])) {
//                freqCounter.put(nums[i], 1);
//            } else {
//                freqCounter.put(nums[i], freqCounter.get(nums[i]) + 1);
//            }
//        }
//        int goodPairs = 0;
//        for(Map.Entry<Integer, Integer> element: freqCounter.entrySet()) {
//            int n = element.getValue();
//            goodPairs += (n-1) * n / 2;
//        }
//        return goodPairs;
//    }

    /** Single Iteration**/
    /** https://leetcode.com/problems/number-of-good-pairs/solutions/1457646/java-story-based-0ms-single-pass-easy-to-understand-simple-hashmap/ **/
    private static int computeGoodPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums) {
            int pairs = freqMap.getOrDefault(num ,0);
            goodPairs += pairs;
            freqMap.put(num, pairs + 1);
        }
        return goodPairs;
    }
}
