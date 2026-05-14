package Binary_search.Bs_On_Answers;
class FindCubertOfNumber{

   public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2; 
        if (ans == m) return 1;
        
    }
    return 0;
   }
    public static int NthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midPower = func(mid, n, m);

            if (midPower == 1) {
                return mid; 
            } else if (midPower == 0) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int n= 3 , m = 27;
        int asn = NthRoot(n, m);
        System.err.println(asn);
    }
}