import java.util.Arrays;

class RotateArrayLeftByOne {
    public static void rotateArrayByOne(int[] nums) {
        
        int n = nums.length;
        int i = 0 ;
        int left = nums[0];
        for( int j = 1 ; j < n ; j++){
            nums[i] =nums[j];
            i++;
            
        }
        nums[n-1]= left;
    }
    public static void main(String[] args) {
        int[] A = {2,3,5,6};
        rotateArrayByOne(A);
        System.out.println(Arrays.toString(A));

    }
}