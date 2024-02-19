import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // Map 을 통해서 key : 아이디, value : 닉네임
        Map<String, String> users = new HashMap<>();
        // List 를 입장, 탈퇴 등록
        List<String[]> chat = new ArrayList<>(); 
        
        for(String re : record){
            StringTokenizer st = new StringTokenizer(re, " ");
            String op = st.nextToken();
            String id = st.nextToken();
            if(op.equals("Enter") || op.equals("Change")){
                String name = st.nextToken();
                users.put(id, name);
            }
            
            if(!op.equals("Change")){
                chat.add(new String[]{op, id});
            }
        }
        
        int len = chat.size();
        String[] answer = new String[len];
        
        for(int i = 0; i < len; i++){
            String[] str = chat.get(i);
            String message = null;
            if(str[0].equals("Enter")){
                message = String.format("%s님이 들어왔습니다.", users.get(str[1]));
            }else{
                message = String.format("%s님이 나갔습니다.", users.get(str[1]));
            }
            answer[i] = message;
        }
        
        
        return answer;
    }
}