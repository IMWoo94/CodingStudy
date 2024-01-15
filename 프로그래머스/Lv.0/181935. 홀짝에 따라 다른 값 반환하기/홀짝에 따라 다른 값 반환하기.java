class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(isEven(n) && isEven(i)){
                answer += i*i;
            }else if(isOdd(n) && isOdd(i)){
                answer += i;
            }
        }
        
        return answer;
    }
    
    public boolean isEven(int num){
        return num % 2 == 0 ? true : false;
    }
    
    public boolean isOdd(int num){
        return num % 2 == 0 ? false : true;
    }
}