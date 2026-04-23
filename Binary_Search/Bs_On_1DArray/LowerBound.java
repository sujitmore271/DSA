package Binary_search.Bs_On_1DArray;

public class LowerBound {
    public static int lowerBound(int[] nums , int target){
        int low = 0  , high = nums.length-1;
        int ans = nums.length;
        while( low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] >= target){
                ans = mid ; 
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,8,15,19};
        int target = 9 ;
        int ans = lowerBound(nums, target);
        System.out.println(ans);
    }
}
