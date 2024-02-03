import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {  
        int answer = 0;
        if(K == 0){
            return answer;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.offer(s);
        }
        
        while(true){
            int min = pq.peek();
            if(pq.size() < 2 ){
                if(min < K){
                    return -1;
                }
            }
            if(min >= K){
                break;
            }
            
            int a = pq.poll();
            int b = pq.poll();
            int comp = a + (b * 2);
            pq.offer(comp);
            answer++;
        }

        return answer;
    }
}