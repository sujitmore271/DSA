package Binary_search.Bs_On_Answers;

public class BookAllocationProblem {
    public static int findPages(int[] nums , int k){
        int n = nums.length;

        if(k > n) return -1;
        
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int page : nums){
            low = Math.min(page , low);
            high += page;
        }
        int ans = high ;

        while (low <= high) {
            int mid = low + (high-low)/2;

            if(canAllocate(nums , mid , k)){
                    ans = mid;
                    high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans ;
    }
    private static boolean canAllocate(int[] pages , int limit , int students){
        int allocatedStudent = 1;

        int currentPage = 0;

        for(int p : pages){
            if( p + currentPage > limit){
                allocatedStudent++;
                currentPage = p ;
            }else{
                currentPage+=p;
            }
        }
        return allocatedStudent <= students;
    }
    public static void main(String[] args) {
         int[] nums = {12, 34, 67, 90} ;
         int m=2;
         System.out.println(findPages(nums, m));
    }
}

