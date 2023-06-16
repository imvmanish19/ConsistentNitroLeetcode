package arrays.easy;

/** https://leetcode.com/problems/find-the-highest-altitude/description/ **/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max = highestAltitude(nums);
        System.out.println(max);
    }

    /** Brute Force **/
//    private static int highestAltitude(int[] gain) {
//        int[] altitude = new int[gain.length+1];
//        int max = 0;
//        for(int i=1;i<altitude.length;i++) {
//            altitude[i] = altitude[i-1] + gain[i-1];
//            if(altitude[i] > max) {
//                max = altitude[i];
//            }
//        }
//        return max;
//    }

    /** O(1) space **/
    private static int highestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for(int value: gain) {
            currentAltitude += value;
            if(currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }
}
