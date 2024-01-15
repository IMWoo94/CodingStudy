class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        
        char[] ch = code.toCharArray();
        
        for(char nm : ch){
            String temp = String.valueOf(nm);
            if(mode == 0){
                if(!temp.equals("1") && cnt % 2 == 0){
                    sb.append(temp);
                }else if(temp.equals("1")){
                    mode = 1;
                }
            }else if(mode == 1){
                if(!temp.equals("1") && cnt % 2 != 0){
                    sb.append(temp);
                }else if(temp.equals("1")){
                    mode = 0;
                }
            }
            cnt++;
        }
        
        if(sb == null || sb.toString().equals("")){
            sb.append("EMPTY");
        }
        
        answer = sb.toString();
        
        return answer;
    }
}