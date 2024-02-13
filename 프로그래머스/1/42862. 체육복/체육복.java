import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        // 잃어버린 학생들을 앞에서 부터 혹은 뒤에서 부터 처리를 하면 빌릴수 있는지 확인 가능
        // 이때, 빌리지 못한 학생의 수 만큼 전체 수에서 뺀다면 그 수가 최대로 들을 수 있는 학생 수
        // 내림 차순 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져왔지만 도난당한 학생 수
        // 다른 학생에게 체육복을 빌려줄 수 없음
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
                    break;
				}
			}
		}
        
        // 도난당했지만 체육복을 빌릴 수 있는 학생 수
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
        
        return answer;
    }
}