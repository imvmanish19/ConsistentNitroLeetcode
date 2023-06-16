package arrays.easy;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        int max = maxProductDifference(nums);
        System.out.println(max);
    }

    public static int maxProductDifference(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if(num > secondMax) {
                secondMax = num;
            }
            if(num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if(num < secondMin) {
                secondMin = num;
            }
        }
        return (firstMax * secondMax) - (firstMin * secondMin);
    }
}
