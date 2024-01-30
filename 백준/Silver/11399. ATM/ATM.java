import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		// 인출하는데 걸리느 최소 시간을 구해라
		// 이러한 경우 앞의 사람이 인출하는 시간까지 기다린다 하면, 가장 빠른 방법은 앞 사람이 인출 시간이 가장 빠른사람부터 시작하면 된다.
		// 즉, 주어진 시간을 오름차순으로 정렬하여 각각의 시간을 더하면 그것이 가장 최솟값
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int answer = 0;
			int wait = 0;
			// 사람 수 입력
			int len = Integer.parseInt(br.readLine());
			// 사람 수 만큼 배열 생성
			int[] people = new int[len];
			// 입력된 사람을 배열에 등록
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < len; i++) {
				people[i] = Integer.parseInt(st.nextToken());
			}
			// 배열을 오름차순으로 정렬
			Arrays.sort(people);
			for (int time : people) {
				wait += time;
				answer += wait;
			}
			bw.write(answer + "");
			bw.flush();
		} catch (Exception e) {

		}
	}
}
