import java.util.*;

class Solution {
    
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(String operation : operations){
            StringTokenizer st = new StringTokenizer(operation, " ");
            String oper = st.nextToken();
            int number = Integer.parseInt(st.nextToken());
            
            if(oper.equals("I")){
                maxHeap.offer(number);
                minHeap.offer(number);
                map.put(number, map.getOrDefault(number, 0) + 1);
                continue;
            }
            
            if(!map.isEmpty()){
                if(number == 1){
                    method(maxHeap, map);
                }else{
                    method(minHeap, map);
                }
            }            
        }
        
        if(!map.isEmpty()){
            answer[0] = method(maxHeap, map);
            answer[1] = method(minHeap, map);
        }
        return answer;
    }
    
    public int method(PriorityQueue<Integer> q, Map<Integer,Integer> map){
        while(!q.isEmpty()){
            int outNum = q.poll();
            if(map.containsKey(outNum)){
                int count = map.get(outNum);
                if( count == 1 ){
                    map.remove(outNum);
                }else{
                    map.put(outNum, map.get(outNum) - 1 );
                }
                return outNum;
            }
        }
        return 0;
    }
}