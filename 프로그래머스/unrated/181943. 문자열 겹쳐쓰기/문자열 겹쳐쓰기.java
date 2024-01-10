class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String sStr = my_string.substring(0, (s == 0 ? 0 : s));
        String eStr = my_string.substring(s + overwrite_string.length());
        
        answer = sStr + overwrite_string + eStr;

        return answer;
    }
}