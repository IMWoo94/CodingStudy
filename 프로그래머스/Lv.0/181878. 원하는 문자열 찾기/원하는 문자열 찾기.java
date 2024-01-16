class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length() < pat.length()){
            answer = 0;
        }else{
            if(myString.toLowerCase().indexOf(pat.toLowerCase()) == -1){
                answer = 0;
            }else{
                answer = 1;
            }
        }
        
        return answer;
    }
}