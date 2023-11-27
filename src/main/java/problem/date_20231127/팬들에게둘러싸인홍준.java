package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/14581
 */
public class 팬들에게둘러싸인홍준 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String 선풍기 = ":fan:";
			String 홍준 = ":" + br.readLine() + ":";
			StringBuilder sb = new StringBuilder();
			sb.append(선풍기.repeat(3) + '\n')
				.append(선풍기 + 홍준 + 선풍기 + '\n')
				.append(선풍기.repeat(3));
			bw.write(sb.toString());
			bw.flush();

		} catch (IOException e) {

		}
	}
}
