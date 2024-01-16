import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        
        while(answer == 0){
            
            int[] temp = Arrays.copyOf(arr, arr.length);
            for(int i = 0; i < arr.length; i++){
                arr[i] = arr[i] >= 50 ? (arr[i]%2==0 ? arr[i]/2 : arr[i]) : (arr[i]%2==0 ? arr[i] : arr[i]*2+1);
            }
            
            if(Arrays.equals(arr, temp)){
                break;
            }
            
            cnt++;
        }
        
        answer = cnt ;
        return answer;
    }
}