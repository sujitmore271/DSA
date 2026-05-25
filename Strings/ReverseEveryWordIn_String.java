package Strings;


class ReverseEveryWordInString {
    public static String reverseWord(String s) {
       
        s = s.trim(); 
        
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        
        int end = i + 1; 

        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                if (i + 1 < end) {
                    sb.append(s, i + 1, end).append(" ");
                }
                end = i;
            }
            i--;
        }
        
        if (0 < end) {
            sb.append(s, 0, end);
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("  the sky is   blue  ")); 
        // Output: "blue is sky the"
    }
}