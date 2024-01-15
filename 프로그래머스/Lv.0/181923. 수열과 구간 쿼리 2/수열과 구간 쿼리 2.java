import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int cnt = 0;
        for(int[] temp : queries){
            int min = -1;
            for(int i = temp[0]; i <= temp[1]; i++){
                if(temp[2] < arr[i]){
                    min = min == -1 ? arr[i] : (min > arr[i] ? arr[i] : min);
                }
            }
            answer[cnt] = min;
            cnt++;
        }
        return answer;
    }
}