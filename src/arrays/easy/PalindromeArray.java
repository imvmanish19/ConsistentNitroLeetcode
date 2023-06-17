package arrays.easy;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,1};
        System.out.println(isPalindrome(nums));
    }

    public static boolean isPalindrome(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
           if(nums[start++] != nums[end--]) {
               return false;
           }
        }
        return true;
    }

    /** Reverse Array Code **/
//    private static void reverse(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        while(start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }

}
