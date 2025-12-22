
import java.util.ArrayList;

public class CheckIfArrayIsSorted {
    class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
       
        for(int i=1 ; i < nums.size() ; i++){
            
            if(nums.get(i) < nums.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
    public static void main(String[] args) {
        
    }
}
