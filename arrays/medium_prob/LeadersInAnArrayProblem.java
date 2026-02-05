package arrays.medium_prob;

import java.util.*;
public class LeadersInAnArrayProblem {
    public static List<Integer> leaders(int[] nums){
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        int maxSoFar = nums[n-1];
        result.add(maxSoFar);
        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i] >= maxSoFar){
                result.add(nums[i]);
                maxSoFar = nums[i];
            }
        }

        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,1,2};
        List<Integer> arr = new ArrayList<>();
        arr = leaders(nums);
        System.out.println(arr);
    }
}
