class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] tStr = str2.toCharArray();
        int cnt = 0;
        
        for(char ch : str1.toCharArray()){
            answer += ch + String.valueOf(tStr[cnt]);
            cnt++;
        }
        
        return answer;
    }
}