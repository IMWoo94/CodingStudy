import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        List<Integer> index = new ArrayList<>();
        Map<String, Integer> words = new HashMap<>();
        
        // A - Z 단어 사전 세팅
        for(int i = 0; i < 26; i++){
            words.put((char)('A' + i) + "", i+1);
        }
        
        StringBuilder sb = new StringBuilder();
        int len = msg.length();
        
        for(int i = 0; i < len; i++){
            String word = sb.toString() + msg.charAt(i);
            if (words.containsKey(word)){
                sb.append(msg.charAt(i));
                if ( i == len - 1 ){
                    index.add(words.get(sb.toString()));
                    break;
                }
                continue;
            }else{
                // 사전 추가
                words.put(word, words.size() + 1);
                index.add(words.get(sb.toString()));
                sb.delete(0, sb.length());
                i--;
            }
            
        }
        
        answer = index.stream().mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}

