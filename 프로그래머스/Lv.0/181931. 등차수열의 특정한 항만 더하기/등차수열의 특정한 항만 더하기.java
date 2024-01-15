class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(boolean x : included){
            if(x){
                answer += a;
            }
            a += d;
        } 
        return answer;
    }
}