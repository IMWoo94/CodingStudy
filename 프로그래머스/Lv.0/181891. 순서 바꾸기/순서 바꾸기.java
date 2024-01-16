import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] start = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] end = Arrays.copyOfRange(num_list, 0, n);    
        
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(start).boxed().collect(Collectors.toList());
        list.addAll(new ArrayList<>(Arrays.stream(end).boxed().collect(Collectors.toList())));
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}