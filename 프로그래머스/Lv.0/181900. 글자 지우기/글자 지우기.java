import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
        
        for(int num : indices){
            list.set(num, "");
        }
        answer = String.join("", list);
        
        return answer;
    }
}