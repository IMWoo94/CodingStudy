class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++){
            int a = numLog[i-1];
            int b = numLog[i];
            int cal = b - a;
            
            if(cal == 1){
                answer += "w";
            }else if(cal == -1){
                answer += "s";
            }else if(cal == 10){
                answer += "d";
            }else if(cal == -10){
                answer += "a";
            }
            
        }
        
        return answer;
    }
}