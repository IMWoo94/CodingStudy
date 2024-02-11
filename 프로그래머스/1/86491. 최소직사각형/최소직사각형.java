class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int vertical = 0;
        int horizon = 0;
        int len = sizes.length;
        for(int i = 0; i < len; i++){
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            vertical = Math.max(v, vertical);
            horizon = Math.max(h, horizon);
        }
        answer = vertical * horizon;
        return answer;
    }
    
}