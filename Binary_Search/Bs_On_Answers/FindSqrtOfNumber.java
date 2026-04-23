package Binary_search.Bs_On_Answers;

import java.util.*;
public class FindSqrtOfNumber {
    public static int num(int n){
        int low = 1 , high = n;
        int ans = Integer.MIN_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(mid*mid == n) return mid ;

            if(mid * mid <= n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(num(28));
    }
}
