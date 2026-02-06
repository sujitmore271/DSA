package arrays.medium_prob;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInAnArray {
    //brute force
    public static int longestConsecutiveBrute(int[] nums) {
    if (nums.length == 0) return 0;

    Arrays.sort(nums);
    int longest = 1;
    int currentCnt = 1;
    int lastSmaller = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == lastSmaller + 1) {
            currentCnt++;
            lastSmaller = nums[i];
        } else if (nums[i] != lastSmaller) { // Skip duplicates
            currentCnt = 1;
            lastSmaller = nums[i];
        }
        longest = Math.max(longest, currentCnt);
    }
    return longest;
}

//optimal 
public static int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    Set<Integer> set = new HashSet<>();
    for (int num : nums) set.add(num);

    int longest = 0;

    for (int x : set) {
        // Only start counting if x is the beginning of a sequence
        if (!set.contains(x - 1)) {
            int currentNum = x;
            int currentCnt = 1;

            while (set.contains(currentNum + 1)) {
                currentNum++;
                currentCnt++;
            }
            longest = Math.max(longest, currentCnt);
        }
    }
    return longest;
}
    public static void main(String[] args) {
        int[] arr = {4,200,300,1,3,2};
        int a =longestConsecutive(arr);
        System.out.println(a);


    }
}
