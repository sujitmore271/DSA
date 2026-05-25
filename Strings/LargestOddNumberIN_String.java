package Strings;

class LargestOddNumberIn_String {
    public static String largeOddNum(String num) {
        // start last to move first
        for (int n = num.length() - 1; n >= 0; n--) {
            int digit = num.charAt(n) - '0';
            
            // if digit is odd max odd
            if (digit % 2 != 0) {
                return num.substring(0, n + 1); 
            }
        }
        
        
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largeOddNum("354276")); // Output: "35427"
        System.out.println(largeOddNum("4206"));   // Output: ""
    }
}
