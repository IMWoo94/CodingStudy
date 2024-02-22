import java.util.*;

class Solution {
    static int answer = 0;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        
        entrance(0, k, dungeons);
        
        return answer;
    }
    
    public void entrance(int cnt, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            // 방문한 던전이거나, 혹은 필요 피로도가 부족한 경우 패스
            if(visited[i] || dungeons[i][0] > k) {
                continue;
            }
            // 방문하면 방문 처리
            visited[i] = true;
            entrance(cnt + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        
        answer = Math.max(cnt, answer);
    }
}