class Solution {
    public int solution(String s) {
        int result = 0;
        int startIndex = 0;
        boolean isNegative = false;
        
        if(s.charAt(0)=='-') {
            startIndex = 1;
            isNegative = true;
        } else if (s.charAt(0) == '+') {
            startIndex = 1; 
        }
        
        for (int i = startIndex; i<s.length(); i++) {
            int digit = s.charAt(i)-'0';
            result = (result * 10) + digit;
        }
        return isNegative ? -result : result;
    }
}