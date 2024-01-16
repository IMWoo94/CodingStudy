import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        // int -> List
        //List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        
        for(int i =0; i < num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}