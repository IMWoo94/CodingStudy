package problem.date_20231121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/3003
 */
public class 킹퀸룩비숍나이트폰 {
	public static void main(String[] args) {
		int[] answer = {1, 1, 2, 2, 2, 8};
		String[] result = new String[6];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int count = 0;
			while (st.hasMoreTokens()) {
				int input = Integer.parseInt(st.nextToken());
				result[count] = answer[count] - input + "";
				count++;
			}
			bw.write(String.join(" ", result));
			bw.flush();
		} catch (IOException e) {

		}
	}
}
