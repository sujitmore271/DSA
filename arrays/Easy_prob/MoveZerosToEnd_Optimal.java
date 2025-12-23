package arrays.Easy_prob;

import java.util.Arrays;

class MoveZerosToEnd_Optimal {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; // Track how many elements we've checked
        int i = 0;
        
        while (count < n) {
            if (nums[i] == 0) {
                // Shift everything left
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[n - 1] = 0;
                // DO NOT increment i here, 
                // because a new number moved into nums[i]
            } else {
                i++; // Only move to next index if current is NOT zero
            }
            count++; // Always increment count to avoid infinite loop
        }
    }
    public static void main(String[] args) {
        int[] A = {2,3,0,4,5};
        moveZeroes(A);
        System.out.println(Arrays.toString(A));
    }
}