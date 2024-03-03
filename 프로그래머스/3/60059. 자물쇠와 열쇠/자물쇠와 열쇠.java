class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = false;
        int holes = 0;
        int ln = lock.length;
        int kn = key.length;
        
        // 자물쇠 홈 영역 카운트
        for(int i = 0; i < ln; i++){
            for(int j = 0; j < ln; j++){
                holes += lock[i][j] == 0 ? 1 : 0;
            }
        }
        
        if(holes == 0){
            return true;
        }
        
        // key 를 90도 회전 총 360도
        for(int loop = 0; loop < 4; loop++){
            // 주어진 key 의 위치에 대해서 Lock 잠금 해제 확인
            for(int i = -kn + 1; i < ln + kn - 1; i++){
                for(int j = -kn + 1; j < ln + kn - 1; j++){
                    if(isPossible(key, lock, j, i, holes)) return true;
                }
            }
            
            // key 90도 회전
            int[][] newKey = new int[kn][kn];
            for(int y = 0; y < kn; y++){
                for(int x = 0; x < kn; x++ ){
                    newKey[y][x] = key[kn - 1 - x][y];
                }
            }
            key = newKey;
        }
        
        return answer;
    }
    
    public boolean isPossible(int[][] key, int[][] lock, int x, int y, int holes){
        int kn = key.length;
        int ln = lock.length;
        for(int i = 0; i < kn; i++){
            int cy = y + i;
            for(int j = 0; j < kn; j++){
                int cx = x + j;
                if(cx < 0 || cy < 0 || cx >= ln || cy >= ln){
                    continue;
                }
                
                if(lock[cy][cx] == 1 && key[i][j] == 1){
                    return false;
                }
                
                if(lock[cy][cx] == 0 && key[i][j] == 1){
                    holes--;
                }
            }
        }
        return holes == 0;
    }
}