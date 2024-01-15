class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String stratStr = my_string.substring(0, s);
        String endStr = my_string.substring(e+1);
        String chStr = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(chStr).reverse();
        
        answer = stratStr + sb.toString() + endStr;
        return answer;
    }
}