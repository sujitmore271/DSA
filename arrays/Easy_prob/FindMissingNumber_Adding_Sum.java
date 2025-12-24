package arrays.Easy_prob;
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = (n*(n+1))/2;
        int sum = 0;
        int i = 0 ;
        while(i < n){
            sum = sum + nums[i];
            i++;
        }
        int miss = ans - sum ;
        return miss;
    }
}