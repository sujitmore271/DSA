package arrays.Easy_prob;

import java.util.Arrays;

class RotateByKElements{
    public static void rotate(int[] nums , int k){
        int n = nums.length;
        if(n==0) return;

         k = k % n;
         reverse(nums, 0, k-1);

         reverse(nums, k, n-1);

         reverse(nums, 0, n-1);
    }

    public static void reverse(int[] nums, int start , int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] A = {2,3,4,5};
        rotate(A, 3);
        System.out.println(Arrays.toString(A));
    }
}