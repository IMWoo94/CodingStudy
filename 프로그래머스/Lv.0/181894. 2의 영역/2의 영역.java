import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        int chkStart = list.indexOf(2);
        int chkEnd = list.lastIndexOf(2);
        if(chkStart == -1){
            answerList.add(-1);
        }else if(chkStart != -1 && chkEnd == -1){
            answerList.add(list.get(chkStart));
        }else{
            int[] temp = Arrays.copyOfRange(arr, chkStart, chkEnd+1);
            answerList = Arrays.stream(temp).boxed().collect(Collectors.toList());
        }
        
        int[] answer = answerList.stream().mapToInt(k -> k).toArray();
        return answer;
    }
}