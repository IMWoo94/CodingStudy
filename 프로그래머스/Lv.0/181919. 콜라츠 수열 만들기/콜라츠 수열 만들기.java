import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        
        while(n != 1){
            list.add(n);
            if(n % 2 == 0){
                n = n/2;
            }else{
                n = 3*n+1;
            }
        }
        list.add(1);
        int listSize = list.size();
        int[] answer = new int[listSize];
        
        for(int i = 0; i < listSize; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}