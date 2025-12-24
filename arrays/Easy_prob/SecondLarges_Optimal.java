package arrays.Easy_prob;
class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length ;
        if(n < 2) return -1;
        int largest = -1;
        int secondLargest = -1;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if ( nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}