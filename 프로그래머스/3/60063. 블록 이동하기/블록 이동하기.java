import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int step = 0;
        int n = board.length;
        Queue<int[]> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        // x좌표_y좌표_가로(0)세로(1)
        q.offer(new int[]{0,0,0});
        visited.add("0_0_0");
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];
                int o = temp[2];
                
                // 도착지점 여부 확인
                if((o == 0 && x == n - 2 && y == n - 1) || 
                  (o == 1 && x == n - 1 && y == n - 2)
                ){
                    return step;
                }

                // 가로
                if(o == 0) {
                    // 오른쪽
                    if(n > x + 2 && board[y][x + 2] == 0){
                        handle(visited, x + 1, y, o, q);
                    }
                    // 왼쪽
                    if(x - 1 >= 0 && board[y][x - 1] == 0){
                        handle(visited, x - 1, y, o, q);
                    }
                    // 아래
                    if(n > y + 1 && n > x + 1 && board[y + 1][x] == 0 && board[y + 1][x + 1] == 0){
                        // 아래 이동
                        handle(visited, x, y + 1, o, q);
                        // 90도 방향 전환
                        // 시계방향
                        handle(visited, x, y, 1, q);
                        // 반시계방향
                        handle(visited, x + 1, y, 1, q);
                    }
                    // 위
                    if(y - 1 >= 0 && n > x + 1 && board[y - 1][x] == 0 && board[y - 1][x + 1] == 0){
                        // 위 이동
                        handle(visited, x, y - 1, o, q);
                        // 90도 방향 전환
                        // 시계방향
                        handle(visited, x + 1, y - 1, 1, q);
                        // 반시계방향
                        handle(visited, x, y - 1, 1, q);
                    }
                }
                // 세로
                else {
                    // 오른쪽
                    if(n > x + 1 && n > y + 1 && board[y][x + 1] == 0 && board[y + 1][x + 1] == 0){
                        // 오른쪽 이동
                        handle(visited, x + 1, y, o, q);
                        // 시계방향 전환
                        handle(visited, x, y + 1, 0, q);
                        // 반시계방향 전환
                        handle(visited, x, y, 0, q);
                    }
                    // 왼쪽
                    if(x - 1 >= 0 && n > y + 1 && board[y][x - 1] == 0 && board[y + 1][x - 1] == 0){
                        // 왼쪽 이동
                        handle(visited, x - 1, y, o, q);
                        // 시계방향 전환
                        handle(visited, x - 1, y, 0, q);
                        // 반시계방향 전환
                        handle(visited, x - 1, y + 1, 0, q);
                    }
                    // 아래
                    if(n > y + 2 && board[y + 2][x] == 0){
                        // 아래 이동
                        handle(visited, x, y + 1, o, q);
                    }
                    // 위
                    if(y - 1 >= 0 && board[y - 1][x] == 0){
                        // 위 이동
                        handle(visited, x, y - 1, o, q);
                    }
                } 
            }
            step++;
        }
        
        return step;
    }
    
    public void handle(Set<String> visited, int x, int y, int o, Queue<int[]> q){
        String str = x + "_" + y + "_" + o;
        if(visited.add(str)) q.offer(new int[]{x, y, o});
    }
}