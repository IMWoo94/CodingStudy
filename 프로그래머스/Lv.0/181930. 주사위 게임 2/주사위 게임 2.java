class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(Integer.compare(a, b) == 0 && Integer.compare(b, c) == 0){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }else if(Integer.compare(a, b) == 0 || Integer.compare(b, c) == 0 || Integer.compare(a, c) == 0){
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }else{
            answer = a + b + c;
        }
        
        
        return answer;
    }
}