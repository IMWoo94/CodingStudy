class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x5 = true;
        boolean x6 = true;
        
        if(x1 || x2){
            x5 = true;
        }else{
            x5 = false;
        }
        
        if(x3 || x4){
            x6 = true;
        }else{
            x6 = false;
        }
        
        if(x5 && x6){
            answer = true;
        }else{
            answer = false;
        }
        
        return (x1 || x2) && (x3 || x4);
    }
}