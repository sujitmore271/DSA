 package arrays.Easy_prob;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    class remove{
        public static int duplicates(int[] nums){
            if(nums.length==0) return 0;

            int i = 0;
            for(int j = 1 ; j < nums.length ; j++){
                if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }
    }
    public static void main(String[] args) {
        int[] A = {2,2,3,5,5,8,8};
        remove.duplicates(A);
        System.out.println(Arrays.toString(A));
    }
    
}
