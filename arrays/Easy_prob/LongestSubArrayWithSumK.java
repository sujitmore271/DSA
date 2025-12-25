package arrays.Easy_prob;

public class LongestSubArrayWithSumK {
    
    // Move the method inside the main class to keep it simple for testing
    public static int longestSubArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        long sum = 0;
        int maxlen = 0;
        int n = nums.length;

        while (right < n) {
            sum = sum + nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 1, 1, 1};
        // Now you call it directly
        int len = longestSubArray(A, 3); 
        System.out.println("Longest length is: " + len);
    }
}