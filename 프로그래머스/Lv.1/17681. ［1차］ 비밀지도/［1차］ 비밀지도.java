class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 입력받은 지도1, 지도2 를 2진수 값으로 변경
        // 이진수 or 연산
        for ( int i = 0; i < n; i++ ){
            // 이진수 or 연산 후 이진수로 표현
            String binary = Long.toBinaryString(arr1[i] | arr2[i]);
            // n 의 길이 맞추기
            String hint = String.format("%0" + n + "d", Long.parseLong(binary));
            answer[i] = hint.replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
}