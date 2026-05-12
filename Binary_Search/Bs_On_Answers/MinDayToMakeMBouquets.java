package Binary_search.Bs_On_Answers;

public class MinDayToMakeMBouquets {
    public static int dayToMake(int n , int[] nums , int m , int k){
       int low = Integer.MAX_VALUE;
       int high = Integer.MIN_VALUE;
       for(int d : nums){
        low = Math.min(d, low);
        high = Math.max(d , high);
       }

       long totalneed =(long) m * k ;
       if (totalneed > n) return -1;

       int ans = high ;

       while(low <= high){
            int mid = low + (high-low)/2;

            if(canMake(mid , nums , m , k)){
                ans = mid ;
                high = mid-1;
            }else{
                low = mid+1;
            }
        
       }
       return ans ;
    }
    private static boolean canMake(int mid , int[] nums , int totalbouqets , int size){
        int count = 0 ;
        int bouquet = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= mid){
                count++;
            }else{
                count = 0;
            }

            if(count == size ){
                bouquet  ++;
                count = 0 ;
            }
        }

            return bouquet >= totalbouqets ;

    }
    public static void main(String[] args) {
        int[] nums = {7,7,7,7,13,11,12,7};
        System.out.println(dayToMake(8, nums, 2, 3));
    }
}
