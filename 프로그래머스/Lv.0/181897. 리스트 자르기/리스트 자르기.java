import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++){
            if(n == 1){
                if(i <= b){
                    list.add(num_list[i]);
                }
            }else if(n == 2){
                if(i >= a){
                    list.add(num_list[i]);
                }
            }else if(n == 3){
                if(i >= a && i <= b){
                    list.add(num_list[i]);
                }
            }else if(n == 4){
                if(i >= a && i <= b && i == (cnt*c+a)){
                    cnt++;
                    list.add(num_list[i]);
                }
            }
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}