class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int[] temp = queries[i];
             for(int j = temp[0]; j <= temp[1]; j++){
                if(j % temp[2] == 0){
                    arr[j] += 1;
                }
             }
        }
        answer = arr;
        return answer;
    }
}