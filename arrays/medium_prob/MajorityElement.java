package arrays.medium_prob;

import java.util.HashMap;

public class MajorityElement {
    //optimal approach 
    static int boyerMooreVoteAlgo(int[] nums){
        int count= 0 , candidate = 0 ;
        for(int num : nums){
            if(count == 0){
                candidate = num;
                count=1;
            }else if(num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    //better approach
     public static int finder(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        int count = map.getOrDefault(nums[i], 0) + 1;
        map.put(nums[i], count);
        if (count > n / 2) {
            return nums[i];
        }
    }
    return -1;
    }

    public static void main(String[] args) {
        int[] num = {2,3,5,2,2,2,2,2,6,2,8,3,2};
         int i = finder(num);
         int j = finder(num);
         System.out.println(i +" "+ j);
    }
}
