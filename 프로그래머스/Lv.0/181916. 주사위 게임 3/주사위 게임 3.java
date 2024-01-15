import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p,q,r = 0;
        
        // 각 변수(배열)를 list로 변환
        List<Integer> numList = Arrays.asList(a, b, c, d);
        
        // 주사위 숫자 1 ~ 6 까지 for 숫자 카운트
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            int cnt = 0;
            
            for(int num : numList){
                if(i+1 == num){
                    cnt++;
                }
            }
            list.add(cnt);
        }
        
        if(list.indexOf(4) != -1){
            p = a;
            answer = 1111 * p;
        }else if(list.indexOf(3) != -1){
            int indexM = list.indexOf(3);
            int indexS = list.indexOf(1);
            p = indexM + 1;
            q = indexS + 1;
            answer = (int)Math.pow((10 * p + q), 2);
        }else if(list.indexOf(1) == -1 && list.indexOf(2) != -1){
            int indexS = list.indexOf(2);
            int indexE = list.lastIndexOf(2);
            p = indexS + 1;
            q = indexE + 1;
            answer = (p + q) * Math.abs(p - q);
        }else if(list.indexOf(1) != -1 && list.indexOf(2) != -1){
            int indexS = list.indexOf(1);
            int indexE = list.lastIndexOf(1);
            q = indexS + 1;
            r = indexE + 1;
            answer = q * r;
        }else{
            answer = Collections.min(numList);
        }
        
        return answer;
    }
}