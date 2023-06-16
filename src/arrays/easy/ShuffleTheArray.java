package arrays.easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int[] output = shuffle(nums, 3);
        System.out.println(Arrays.toString(output));
    }

    /** One Solution **/
//    private static int[] shuffle(int[] nums, int n) {
//        int[] output = new int[nums.length];
//        int start = 0;
//        int end = nums.length - 1;
//        int mid = (start+end)/2 + 1;
//        int i = 0;
//        while(mid <= end) {
//            output[i++] = nums[start++];
//            output[i++] = nums[mid++];
//        }
//        return output;
//    }

    private static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int N = nums.length;
        int index = 0;
        for(int i=0;i<N/2;i++) {
            output[index++] = nums[i];
            output[index++] = nums[i+n];
        }
        return output;
    }
}
