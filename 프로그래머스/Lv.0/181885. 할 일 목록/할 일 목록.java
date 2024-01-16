import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        List<String> answerlist = new ArrayList<>();
    
        list = Arrays.asList(todo_list);
        for(String todo : list){
            if(!finished[list.indexOf(todo)]){
                answerlist.add(todo);
            }
        }
        
        String[] answer = answerlist.toArray(new String[0]);
        
        return answer;
    }
}