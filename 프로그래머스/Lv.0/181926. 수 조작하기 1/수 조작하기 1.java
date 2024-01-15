class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int wCnt = control.length() - control.replace("w", "").length();
        int aCnt = control.length() - control.replace("a", "").length();
        int sCnt = control.length() - control.replace("s", "").length();
        int dCnt = control.length() - control.replace("d", "").length();
        
        answer = wCnt - sCnt + (dCnt*10) - (aCnt*10) + n;
        
        return answer;
    }
}