import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        // LRU 가장 오랫동안 사용되지 않은 페이지 제거
        List<String> cache = new ArrayList<>();
        
        for(String city : cities){
            // 대소문자 구분하지 않기 때문에 대문자로 변환
            String word = city.toUpperCase();
            
            // 캐시가 비어 있다면, 캐시 등록 처리 단, 캐시 미스
            if(cache.isEmpty()){
                cache.add(word);
                answer += 5;
            }else if(cache.contains(word)){
                // 캐시 히트
                answer += 1;
                // LRU 이기 때문에 히트 된 것 맨 뒤로 옮기기
                String temp = cache.remove(cache.indexOf(word));
                cache.add(temp);
            }else{
                // 캐시 미스
                // 캐시가 꽉찬 경우
                if(cache.size() == cacheSize){
                    cache.add(word);
                    // 가장 앞에 있는 캐시 제거
                    cache.remove(0);
                }else{
                    cache.add(word);
                }
                answer += 5;
            }
            
        }
        
        return answer;
    }
}