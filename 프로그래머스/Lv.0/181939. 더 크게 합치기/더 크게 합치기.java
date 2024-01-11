class Solution {
    public int solution(int a, int b) {
        int fStr = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int tStr = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        int answer = fStr >= tStr ? fStr : tStr;
        return answer;
    }
}