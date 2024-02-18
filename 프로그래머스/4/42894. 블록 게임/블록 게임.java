class Solution {
    public static int BLACK = 201;
    public int solution(int[][] board) {
        int answer = 0;
        /** 주어진 블록에 대해서 일반화를 진행 한다.
        * 주어진 12개의 블록 중 제거 가능한 블록은 총 5개의 블록만이 존재한다.
        * 1. 2개의 검은 블록 + 4개의 블록 ( 총 6개의 블록이 필요 하다. )
        * 2. 2 x 3 / 3 x 2 의 크기를 필요로 한다.
        */
        
        int n = board.length;
        boolean hasDeleted = true;
        // 블록이 제거가 되지 않을 때 까지 무한 반복
        while(hasDeleted){
            hasDeleted = false;

            // 위에서 부터 존재하는 블럭을 만나기 까지 검은 블록으로 채우기
            for(int j = 0; j < n; j++){
                for(int i = 0; i < n; i++){
                    int block = board[i][j];
                    if(block == 0 || block == BLACK){
                        board[i][j] = BLACK;
                    }else{
                        break;
                    }
                }
            }

            // 모든 위치를 돌아다니면서 [ 2 x 3, 3 x 2 / 검은블록2 + 블록4 ] 를 만족하는 위치를 찾아낸다.
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    // 범위를 벗어나지 않는 경우에만 진행
                    if( i <= n - 2 && j <= n - 3){
                        // 검은블록 2 + 동일 블록 4개를 만족하는 메소드
                        boolean isPossble = checkPossble(board, j, i, 3, 2);

                        if(isPossble){
                            hasDeleted = true;
                            answer++;
                        }
                    }

                    if(!hasDeleted && i <= n - 3 && j <= n - 2 ){
                        boolean isPossble = checkPossble(board, j, i, 2, 3);

                        if(isPossble){
                            hasDeleted = true;
                            answer++;
                        }
                    }
                }   
            }
        }
        
        
        
        return answer;
    }
    
    public boolean checkPossble(int[][] board, int x, int y, int xl, int yl){
        int color = -1;
        int blackCnt = 0;
        int blockCnt = 0;
        
        for(int i = 0; i < yl; i++){
            for(int j = 0; j < xl; j++){
                int blockColor = board[i + y][j + x];
                // BLACK Block 갯수 확인
                if(blockColor == BLACK){
                    blackCnt++;
                }
                // 일반 Bolck 초기화 및 확인
                else if(blockColor > 0){
                    if(color == -1 || blockColor == color){
                        color = blockColor;
                        blockCnt++;
                    }
                }
            }
        }
        
        if(blackCnt == 2 && blockCnt == 4){
            for(int i = 0; i < yl; i++){
                for(int j = 0; j < xl; j++){
                    // 해당 블록 제거 처리
                    board[i + y][j + x] = 0;
                }
            }
            return true;
        }
        return false;
    }
}