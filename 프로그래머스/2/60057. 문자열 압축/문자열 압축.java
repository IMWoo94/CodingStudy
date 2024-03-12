class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        // 최대 압축은 문자열 크기의 절반
        for(int cnt = 1; cnt <= s.length() / 2; cnt++){
            StringBuilder sb = new StringBuilder();
            
            String cur = "";
            int count = 1;
            int i = 0;
            while(i < s.length()){
                StringBuilder temp = new StringBuilder();
                for(int j = 0; j < cnt; j++){
                    if( i == s.length() ) break;
                    temp.append(s.charAt(i++));
                }
                
                String target = temp.toString();
                if(cur.equals(target)){
                    count++;
                }else{
                    sb.append(count == 1 ? "" : String.valueOf(count)).append(cur);
                    cur = target;
                    count = 1;
                }
            }
            sb.append(count == 1 ? "" : String.valueOf(count)).append(cur);
            // System.out.println(sb.toString() + " : cnt : " + cnt);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}