import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] inter : intervals){
            for(int i = inter[0]; i <= inter[1]; i++){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream().mapToInt(k -> k).toArray();
        return answer;
    }
}