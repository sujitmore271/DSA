package Binary_search.Bs_On_Answers;

public class CapacityOfShipPackageWithinDDays {
    public static int shipWithindDays(int[] weights , int days){
        int low = 0 ;
        int high = 0 ;
        for(int pack : weights){
            low = Math.max(pack, low);
            high += pack;
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2 ;

            if(canShip(weights , mid , days)){
                ans = mid ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean canShip(int[] weights , int limit , int days){
        int daysneed = 1;

        int currentWeight = 0 ;

        for(int w : weights){

            if( currentWeight + w > limit){
                daysneed++;
                currentWeight = w;
            }else{
                currentWeight += w ;
            }
        }
        return daysneed <= days;
    }
    public static void main(String[] args) {
         int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int days = 5;
         System.out.println(shipWithindDays(weights, days));
    }
}

