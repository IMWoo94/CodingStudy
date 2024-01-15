import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 참가자를 Map 에 등록한다.
        // 이때, 동명이인이 존재할 수 있으므로 이름과 참여 수로 나타낸다.
        Map<String, Integer> count = new HashMap<>();
        for(String name : participant){
            count.put(name, count.getOrDefault(name, 0) + 1);
        }
        
        // 완주한 인력에 대해서 count 정보를 하나씩 줄여 나간다.
        for(String name : completion){
            count.put(name, count.get(name) - 1);
        }
        
        // 결과적으로 count 가 0 이 아닌 1로 남아있는 사람이라면 완주하지 못한 사람
         for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            
            if (value == 1) {
                answer = key;
                break;
            }
        }
        
        return answer;
        
    }
}