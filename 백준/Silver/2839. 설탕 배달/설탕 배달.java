import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		// N 킬로그램을 배달해야 하는 과정에서 최소한의 설탕봉지를 구하기
		// 5,3 이 존재하며 최소한의 봉지를 가져간다.
		// 5 를 먼저 소비하고 3으로 채운다.
		// 정확하게 나뉘지 않으면 -1
		int[] sugar = {5, 3};
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int N = Integer.parseInt(br.readLine());
			int answer = 0;
			while (true) {
				if (N % 5 == 0) {
					answer += N / 5;
					bw.write(answer + "");
					bw.flush();
					return;
				} else {
					N -= 3;
					answer++;
				}
				if (N < 0) {
					bw.write(-1 + "");
					bw.flush();
					return;
				}
			}
		} catch (Exception e) {

		}
	}
}
