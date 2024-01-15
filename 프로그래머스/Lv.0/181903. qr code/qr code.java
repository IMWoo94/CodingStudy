class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for(int i = 0; i < code.length(); i++){
            int chk = i % q;
            if( chk == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }
}