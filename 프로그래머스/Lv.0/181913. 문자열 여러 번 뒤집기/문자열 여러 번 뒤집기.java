class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int[] se : queries){
            
            String startStr = my_string.substring(0, se[0]);
            String str = my_string.substring(se[0], se[1]+1);
            String endStr = my_string.substring(se[1]+1);

            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            
            my_string = startStr + reverse + endStr;
        }
        answer = my_string;
        return answer;
    }
}