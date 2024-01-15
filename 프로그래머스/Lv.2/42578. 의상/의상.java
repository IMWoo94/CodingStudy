import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> kind = new HashMap<>();
        
        // 의상의 종류 카운팅
        for( String[] clothe : clothes ){
            kind.put(clothe[1], kind.getOrDefault(clothe[1], 0) + 1);
        }
        
        // 의상의 종류와 입지 않는 경우를 생각해서 조합 갯수 구하기
        for ( int num : kind.values() ){
            answer *= num + 1;
        }
        
        // 조합 갯수를 곱하기 위해서 초기 값을 1 로 제공하였기에 -1
        return answer - 1;
    }
}