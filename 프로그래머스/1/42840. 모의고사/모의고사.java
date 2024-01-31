import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        Map<Integer, List<Integer>> students = new HashMap<>(){{
            put(0, List.of(1, 2, 3, 4, 5));
            put(1, List.of(2, 1, 2, 3, 2, 4, 2, 5));
            put(2, List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
        }};
        List<Integer> score = Arrays.asList(0,0,0);
        
        for(int i = 0; i < answers.length; i++){
            int ans = answers[i];
            for(Map.Entry<Integer, List<Integer>> map : students.entrySet()){
                int number = map.getKey();
                List<Integer> exam = map.getValue();
                int index = i % exam.size();
                if(exam.get(index) == ans){
                    score.set(number, score.get(number) + 1);
                }
            }
        }
        
        // 최고 점수 get
        int max = score.stream().max((o1, o2) -> {
			return o1 - o2;
		}).get();
        
        List<Integer> temp = new ArrayList<>();
        // 최고 점수와 일치하는 학생 get
        for(int i = 0; i < score.size(); i++){
            if(score.get(i) == max){
                temp.add(i + 1);
            }
        }
        answer = temp.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}