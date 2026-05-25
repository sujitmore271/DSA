package Strings;

import java.util.*;

class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        // Guard clause for empty inputs
        if (str == null || str.length == 0) return "";
        
        // 1. Sort the array alphabetically
        Arrays.sort(str);
        
        String first = str[0];
        String last = str[str.length - 1];
        int k = 0;
        
        
        while (k < first.length() && k < last.length()) {
      
            if (first.charAt(k) != last.charAt(k)) {
                return first.substring(0, k); 
            }
            k++;
        }
        
        
        return first.substring(0, k);
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println("Prefix: " + longestCommonPrefix(input)); // Output: "fl"
    }
}
