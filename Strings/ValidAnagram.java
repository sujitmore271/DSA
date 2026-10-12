package Strings;


public class ValidAnagram {
    public static boolean validAnagram(String s , String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        int i = 0 ;
        while(i < s.length()){
            count[s.charAt(i) - '0']++;
            count[t.charAt(i) - '0']--;

            i++;
        }
         for(int val : count){

            if(val != 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
