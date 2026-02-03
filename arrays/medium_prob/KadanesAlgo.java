package arrays.medium_prob;
public class KadanesAlgo {

    // brute force approach
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE ;

        for(int i = 0 ; i < nums.length -1 ; i++){
            
            for(int j = i ; j < nums.length ; j++){
                 int sum = 0 ;

                  for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                 maxi = Math.max(maxi, sum);
                
            }
        }


        return maxi;
    }

    // optimal kadanes algorithm
    static int kadanesAlgo(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length-1 ; i++){
            sum += nums[i];

            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] num = {-2,-1,-3};
        int a = kadanesAlgo(num);
        System.out.println(a);

    }
}
