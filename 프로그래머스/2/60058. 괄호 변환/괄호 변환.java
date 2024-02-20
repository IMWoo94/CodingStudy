import java.util.*;

class Solution {
    public String solution(String p) {
        String answer = "";
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환
        if(p.length() == 0){
            return answer;
        }
        
        // 재귀
        answer = recursive(p);
        
        return answer;
    }
    
    public String recursive(String str){
        if(str == null || str.isBlank()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        // 2. 균형잡힌 괄호 문자열 u, v 로 분리
        Map<String, Integer> map = new HashMap<>();
        boolean isBalance = false;
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        for(char c : str.toCharArray()){
            // map 괄호 문자를 등록
            String s = String.valueOf(c);
            map.put(s, map.getOrDefault(s, 0) + 1);
            if(!isBalance){
                int leftCnt = map.getOrDefault("(", 0);
                int rightCnt = map.getOrDefault(")", 0);
                
                // 균형잡힌 문자열인 경우
                u.append(s);
                
                if(leftCnt != 0 && rightCnt != 0 && leftCnt == rightCnt){
                    isBalance = true;
                }
                continue;
            }
            v.append(s);
        }
        
        // 3. 문자열 u가 "올바른 괄호 문자열" 인가?
        Stack<String> stack = new Stack<>();
        boolean isComplate = true;
        for(char c : u.toString().toCharArray()){
            String op = String.valueOf(c);
            if(op.equals("(")){
                stack.push(op);
            }else{
                if(stack.isEmpty()){
                    isComplate = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        
        if(isComplate){
            // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
            // 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
            return u.toString() + recursive(v.toString());
        }else{
            // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
            // 4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            StringBuilder temp = new StringBuilder();
            temp.append("(");
            // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            temp.append(recursive(v.toString()));
            // 4-3. ')'를 다시 붙입니다. 
            temp.append(")");
            // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            String word = u.toString();
            if(word.length() > 2){
                word = word.substring(1, word.length()-1);
                StringBuilder reWord = new StringBuilder();
                for(char c : word.toCharArray()){
                    String op = String.valueOf(c);
                    if(op.equals("(")){
                        reWord.append(")");
                    }else{
                        reWord.append("(");
                    }
                }
                return temp.toString() + reWord.toString();
            }else{
                return temp.toString();
            }
        }
    }
}