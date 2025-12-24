package arrays.Easy_prob;

public class FindMissingNumber_XorMethod {
    public static int missingnum(int[] nums){
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 0 ; i < n ; i++){
            xor1 = xor1 ^ i ;
        }
        
        for(int num : nums){
            xor2 = xor2 ^ num;
        }
        return xor1 ^ xor2;
    }
    
}