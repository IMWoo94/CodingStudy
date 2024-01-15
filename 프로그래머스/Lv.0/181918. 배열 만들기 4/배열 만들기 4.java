import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while( i < arr.length){
            if(list.size() == 0){
                list.add(arr[i]);
                i++;
            }else{
                int lastSize = list.size()-1;
                int a = list.get(lastSize);
                if(a < arr[i]){
                    list.add(arr[i]);
                    i++;
                }else{
                    list.remove(lastSize);
                }
            }
        }
        int[] stk = list.stream().mapToInt(k->k).toArray();
        return stk;
    }
}