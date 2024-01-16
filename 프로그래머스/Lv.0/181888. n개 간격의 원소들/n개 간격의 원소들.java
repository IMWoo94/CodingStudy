import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        int cnt = 0;
        for(int i = 0; i < num_list.length; i++ ){
            if(i == cnt*n){
                list.add(num_list[i]);
                cnt++;
            }
        }
        
        int[] answer = list.stream().mapToInt(k -> k).toArray();
        return answer;
    }
}