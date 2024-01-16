import java.util.*;

class Solution {
    public int[] solution(String my_string) {        
        List<Integer> cntList = new ArrayList<>();
        for(int i = 0; i < 52; i++){
            char ch;
            if( i <= 25 ){
                ch = (char)(65+i);
            }else{
                ch = (char)(71+i);
            }
            long cnt = my_string.chars().filter(c -> c == ch).count();

            cntList.add((int)cnt);
        }
        
        int[] answer = cntList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}