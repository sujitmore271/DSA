package arrays.Easy_prob;
class MoveZerosToEnd_Brute{
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; 
        int i = 0;
        
        while (count < n) {
            if (nums[i] == 0) {
               
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[n - 1] = 0;
               
            } else {
                i++; 
            }
            count++; 
        }
    }
}