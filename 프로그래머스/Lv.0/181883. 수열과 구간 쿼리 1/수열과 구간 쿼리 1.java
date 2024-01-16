import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        for(int[] quer : queries){
            for(int i = quer[0]; i <= quer[1]; i++){
                answer[i] += 1;
            }
        }

        
        return answer;
    }
}