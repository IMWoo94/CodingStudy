package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/5575
 */
public class 타임카드 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			for (int i = 0; i < 3; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int start =
					Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60
						+ Integer.parseInt(
						st.nextToken());
				int end =
					Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60
						+ Integer.parseInt(
						st.nextToken());

				int work = end - start;

				// 시간, 분, 초로 변환
				int hours = work / 3600;
				int minutes = (work % 3600) / 60;
				int seconds = work % 60;

				bw.write(hours + " " + minutes + " " + seconds + "\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
