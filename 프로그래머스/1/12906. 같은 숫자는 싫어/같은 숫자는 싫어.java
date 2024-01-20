import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> s = new Stack<>();
        for(int num : arr){
            if(s.isEmpty()){
                s.push(num);
            }else{
                if(s.peek() != num){
                    s.push(num);
                }
            }
        }
        answer = s.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}