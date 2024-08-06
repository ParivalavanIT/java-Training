public class LongestincreasingSubset {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int currentMax = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    currentMax = Math.max(currentMax, dp[j]);
                }
            }
            dp[i] = currentMax + 1;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    public static void longestIncreasingSubset(int[] array) {
        int length = lengthOfLIS(array);
        System.out.println("Length of longest increasing subset: " + length);
    }
    public static void main(String[] args) {
        int[] array = { 5,1,12,15,18 };
        longestIncreasingSubset(array);
    }
}
