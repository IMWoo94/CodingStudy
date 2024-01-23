import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
파일명을 세 부분으로 나누어 정렬하는 문제이다. 
세 부분으로 나누지만 실제 정렬 시에는 HEAD와 NUMBER 부분만 고려하면 된다.

정규식으로 Head, Number 분리하여 File[]을 만들어 객체로 저장한다.

HEAD의 경우 대소문자 구분이 없으므로 전부 소문자로 변경한다. (or 대문자도 가능)
NUMBER의 경우 문자열을 숫자로 바꾸어 저장한다.
소팅한다. Arrays.sort()를 사용했고, Comparator을 정의해서 넣어주었다. 정렬하는 방법은 자꾸 잊어버려서 여기에 정리해두었다.

HEAD 부분이 같은지 확인해서 같다면 NUMBER 오름차순으로 정렬한다.
HEAD 부분이 다르다면 HEAD부분을 기준으로 사전 순 정렬한다.
정렬 된 File[] 배열의 원래 파일명을 리턴한다.
*/
class Solution {
    public String[] solution(String[] files) {
        
        // HEAD + NUMBER 분리 정규식 패턴
        String patternString = "([a-zA-Z- .]+)([0-9]+)";
        
        // 1) 문자열 형태의 정규표현식 문법을 정규식 패턴으로 변환
        Pattern pattern = Pattern.compile(patternString); 
        
        File[] file_info = new File[files.length];

        for (int i = 0; i < files.length; i++) {
            // 2) 패턴 객체로 matcher 메서드를 통해 문자열을 검사하고 필터링된 결과를 매처 객체로 반환
            Matcher matcher = pattern.matcher(files[i]);
            if(matcher.find()){
                file_info[i] = new File(matcher.group(1).toLowerCase(), Integer.parseInt(matcher.group(2)), files[i]);
            }
        }
        
        Arrays.sort(file_info, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if ((o1.head).equals(o2.head)) { 	// HEAD 부분이 같다면 
                    return o1.number-o2.number; 	// NUMBER 오름차순 정렬
                }else{
                    return (o1.head).compareTo(o2.head); // HEAD 부분을 기준으로 사전 순 정렬
                }
            }
        });
        
        String[] answer = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            answer[i] = file_info[i].origin;
        }
        
        return answer;

    }
    
    class File{
        String head;
        int number;
        String origin;
        
        public File(String head, int number, String origin){
            this.head = head;
            this.number = number;
            this.origin = origin;
        }
    }
}