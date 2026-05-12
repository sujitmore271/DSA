package Binary_search.Bs_On_Answers;

class KoKoEatingBananas{
    public static int minimumRateToEatBananas(int[] nums, int h) {
        int low = 1 ;
        int high= max(nums);
        int ans = high;
         
         while(low <= high){
            int mid = low + (high-low)/2;
            long totalHours = calculateTotalHours(nums,mid);
            if(totalHours <= h){
                ans = mid ;
                high = mid -1;
            }else{
                low = mid+1;
            }
         }
         return ans;
    }
    public static int max(int[] nums){
        int max = 0 ;
        for( int p : nums) max = Math.max(p , max);
        return max;
    }

  private static long calculateTotalHours(int[] piles, int k) {
        long totalH = 0;
        for (int pile : piles) {
            totalH += (pile + k - 1) / k; // Standard way to get ceil(pile/k)
        }
        return totalH;
    }

    public static void main(String[] args) {
        int[] nums = {7, 15, 6, 3} ;
        int  h = 8;
        System.out.println(minimumRateToEatBananas(nums, h));
    }
}