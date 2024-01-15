import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        for(String str : intStrs){
            int num = Integer.parseInt(str.substring(s,s+l));
            
            if(num > k){
                answerList.add(num);
            }
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}