import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        // 0. 2차원 배열로 만들기
        String[][] game = new String[m][];
        for(int i = 0; i < m; i++){
            game[i] = board[i].split("");
        }
        
        List<int[]> pangs = new ArrayList<>();
        while(true){
            // 1. [y, x], [y, x+1], [y+1, x], [y+1, x+1] 동일 여부
            for(int y = 0; y < m-1; y++){
                for(int x = 0; x < n-1; x++){
                    String pair = game[y][x];
                    String a = game[y][x+1];
                    String b = game[y+1][x];
                    String c = game[y+1][x+1];
                    if(pair.equals(a) && pair.equals(b) && pair.equals(c) && !pair.equals("팡")){
                        pangs.add(new int[]{y, x});
                    }
                }
            }

            // 2. 동일한 [y, x] 의 정보를 토대로 오른쪽, 아래, 오른쪽대각선을 클리어 처리
            for(int[] pang : pangs){
                int y = pang[0];
                int x = pang[1];
                game[y][x] = "팡";
                game[y][x+1] = "팡";
                game[y+1][x] = "팡";
                game[y+1][x+1] = "팡";
            }
        
            // 3. 위에서 부터 클리어 된 곳이 있다면 한칸 씩 내리기
            for(int i = 0 ; i < m; i++){
                for(int y = 0; y < m-1; y++){
                    for(int x = 0; x < n; x++){
                        if(game[y+1][x].equals("팡")){
                            String temp = game[y+1][x];
                            game[y+1][x] = game[y][x];
                            game[y][x] = temp;
                        }
                    }
                }
            }
            
            
            if(pangs.isEmpty()){
                break;
            }else{
                pangs.clear();
            }
        }
        // 1 ~ 3 계속 반복 - 동일한게 나오지 않을때 까지
        
        // 4. 클리어된 갯수 카운팅
        for(int y = 0; y < m; y++){
            for(int x = 0; x < n; x++){
                if(game[y][x].equals("팡"))
                    answer++;
            }
        }
        return answer;
    }
}