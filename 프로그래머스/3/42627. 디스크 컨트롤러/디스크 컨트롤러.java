import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        // 수행 후 시간
        int end = 0;
        int jobsIdx = 0; // 수행중인 인덱스
        int count = 0; // 수행된 요청 갯수
        int len = jobs.length;
        
        // 원본 내열 오름차순 정렬 ( 요청시간 기준 )
        Arrays.sort(jobs, (o1, o2) -> {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            });
        
        // 처리 시간 오름차순으로 정렬되는 우선순위 큐
        PriorityQueue<int[]> p = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        // 모든 요청이 수행 될 떄 까지
        while(count < len){
            
            // 하나의 작업이 돌아가는 시점에 들어온 요청
            while(jobsIdx < len && jobs[jobsIdx][0] <= end){
                p.offer(jobs[jobsIdx++]);
            }
            
            // 큐가 비어 있다면 작업 완료 이후에 다시 요청이 들어오는 것이므로
            // end 를 다시 처음으로 시작할 값으로 맞춘다.
            if(p.isEmpty()){
                end = jobs[jobsIdx][0];
            }else{
                int[] temp = p.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }
        
        
        return (int) Math.floor(answer/len);
    }
}