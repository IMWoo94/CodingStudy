import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String str = String.join("", str_list);
        
        int r_num = str.indexOf("r");
        int l_num = str.indexOf("l");
        
        if( r_num == -1 && l_num == -1){
             str = "";
        }else if(r_num == -1){
            str = str.substring(0, l_num);
        }else if(l_num == -1){
            str = str.substring(r_num+1);
        }else{
            if(r_num > l_num){
                str = str.substring(0, l_num);
            }else{
                str = str.substring(r_num+1);
            }
        }
        
        if(str.length() == 0){
            String[] answer = {};
            return answer;
        }else{
            String[] answer = str.split("");
            return answer;
        }
    }
}