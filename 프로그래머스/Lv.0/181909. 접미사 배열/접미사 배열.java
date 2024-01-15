import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> strList = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            strList.add(my_string.substring(i));
        }
        Collections.sort(strList);
        String[] answer = strList.stream().toArray(String[]::new);
        return answer;
    }
}