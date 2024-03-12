import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] sortLottos = reverseOrderSort(lottos);
        int[] sortWin_nums = reverseOrderSort(win_nums);
        
        int count = 0;
        int wc = 0;
        for(int i = 0; i < 6; i++){
            int num = sortLottos[i];
            if(sortLottos[i] == 0){
                wc++;
                continue;
            }
            
            for(int k = 0; k < 6; k++){
                if(sortWin_nums[k] == num){
                    count++;
                    break;
                }
            }
        }
        answer[0] = prize(count + wc);
        answer[1] = prize(count);
        return answer;
    }
    
    public int[] reverseOrderSort(int[] arr){
        return Arrays.stream(arr)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    public int prize(int num){
        if(num == 6) return 1;
        if(num == 5) return 2;
        if(num == 4) return 3;
        if(num == 3) return 4;
        if(num == 2) return 5;
        return 6;
    }
}