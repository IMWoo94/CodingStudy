class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int[] temp : queries){
            int a = arr[temp[0]];
            int b = arr[temp[1]];
            arr[temp[0]] = b;
            arr[temp[1]] = a;
        }
        
        answer = arr;
        return answer;
    }
}