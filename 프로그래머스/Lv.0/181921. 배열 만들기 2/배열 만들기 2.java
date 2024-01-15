import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = l; i <= r; i++){
            if(i % 5 == 0){
                String str = i + "";
                char[] chList = str.toCharArray();
                boolean flag = true;
                for(char ch : chList ){
                    if(ch == '0' || ch == '5'){
                        continue;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    list.add(i);
                }
            }
        }
        int size = list.size();
        int[] answer = new int[size == 0 ? 1 : size];
        answer[0] = -1;
        for(int j = 0; j < size; j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}