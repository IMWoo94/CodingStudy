import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int plus = 0;
        int mult = 1;
        
        for(int num : num_list){
            plus += num;
            mult *= num;
        }
        plus = (int)Math.pow(plus, 2);
        answer = Integer.compare(mult, plus);
        answer = answer == -1 ? 1 : 0;
        
        return answer;
    }
}