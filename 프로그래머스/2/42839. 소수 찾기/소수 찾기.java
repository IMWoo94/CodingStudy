import java.util.*;

class Solution {
    Set<Integer> nums = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        // 1. 모든 조합의 숫자를 만들어 낸다.
        comb("", numbers);
        
        // 2. 소수의 개수만 카운팅
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int number = it.next();
            if(isPrime(number)){
                answer++;
            }
        }
        // 3. 소수의 개수 반환
        
        return answer;
    }
    
    public boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }
        int len = (int)Math.sqrt(number);
        
        for(int i = 2; i <= len; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public void comb(String str, String other){
        // 1. 현재의 조합을 저장
        // 중복은 알아서 걸러질 예정
        if(!str.equals(""))
            nums.add(Integer.valueOf(str));
        
        // 2. 남은 숫자 중 한개를 더해 새로운 조합을 만든다.
        for(int i = 0; i < other.length(); i++){
            comb(str + other.charAt(i), other.substring(0, i) + other.substring(i+1));
        }
    }
}