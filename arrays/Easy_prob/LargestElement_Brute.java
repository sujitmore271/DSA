package arrays.Easy_prob;

public class LargestElement_Brute {
    
    class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            int key = nums[i];
            int j = i-1;
            while(j>0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums[n-1];
    }
}
}
