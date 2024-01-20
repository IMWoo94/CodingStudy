import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int days = 1;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> counter = new HashMap<>();
        Stack<Integer> order = new Stack<>();
        
        // 기능 고유번호 등록
        for(int i = 0; i < progresses.length; i++){
            queue.add(i);
        }
        
        while(!queue.isEmpty()){
            int program = queue.peek();
            int comp = progresses[program] + speeds[program] * days;
            if(comp >= 100){
                queue.remove();
                counter.put(days, counter.getOrDefault(days, 0) + 1);
                if(order.isEmpty()){
                    order.push(days);
                }else{
                    if(order.peek() != days){
                        order.push(days);
                    }
                }
            }else{
                days++;
            }
        }
        
        answer = order.stream().mapToInt(key -> counter.get(key)).toArray();
        
        return answer;
    }
}