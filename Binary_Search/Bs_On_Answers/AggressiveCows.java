package Binary_search.Bs_On_Answers;

import java.util.Arrays;

public class AggressiveCows {
    public static int minDist(int[] nums , int k){
        Arrays.sort(nums);
        int n = nums.length;
       int low = 1;
       int high = nums[n-1] - nums[0];
       int ans = high;

       while(low <= high ){
        int mid = low + (high-low)/2;

        if(placeDist(nums, mid , k)){
            ans = mid ;
            low = mid + 1;
        }else{
            high = mid - 1; 
        }
       }
       return ans ;

    }
    private static boolean placeDist(int[] stalls , int distance , int cows){
        int placedCows = 1 ;

        int cowPlacedAt = stalls[0];

        for(int i = 1 ; i < stalls.length ; i++){

            if(stalls[i] - cowPlacedAt >= distance){
                placedCows++;
                cowPlacedAt = stalls[i];
            }
        }
            return placedCows >= cows;

    }
    public static void main(String[] args) {
         int k = 4;
         int[] nums = {0, 3, 4, 7, 10, 9};
         System.out.println(minDist(nums, k));
    }
}
