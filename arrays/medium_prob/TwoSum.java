package arrays.medium_prob;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //optimal approach
    public static int[] hashAns( int[] arr , int target){
            HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0 ; i<arr.length ; i++){
            int needed = target - arr[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i}; 
            }
            map.put(arr[i],i);
        }
        return new int[]{};

    }


    //brute force approach
  
    public static int[] twoSum(int[] nums, int target) {
       
        for (int i = 0 ; i < nums.length ; i++){
            int j = i+1 ;
            while(j<nums.length){
                if(nums[i] + nums[j] == target){
                   return new int[]{i, j};
                }
                j++;
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] arr = {-6, 7, 1, -7, 6, 2};
        int[] ans = hashAns(arr, 3);
        System.out.println(Arrays.toString(ans));
    }
}
