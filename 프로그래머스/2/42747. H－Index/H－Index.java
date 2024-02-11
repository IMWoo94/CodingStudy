import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        if(len == 0){
            return 0;
        }
        
        Arrays.sort(citations);
        
        for(int i = 0; i < len; i++){
            // 논문 갯수
            int h = len - i;
            
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
   
        
        return answer;
    }
}