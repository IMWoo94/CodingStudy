class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] strArray = my_string.split("(?<=\\G.{" + m + "})");
        
        for(String s : strArray){
            char[] ch = s.toCharArray();
            
            answer += ch[c-1];
        }
        
        return answer;
    }
}