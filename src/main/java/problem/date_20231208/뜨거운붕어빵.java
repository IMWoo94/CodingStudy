package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11945
 */
public class 뜨거운붕어빵 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int high = Integer.parseInt(st.nextToken());
			int len = Integer.parseInt(st.nextToken());

			for (int i = 0; i < high; i++) {
				String input = br.readLine();
				StringBuilder result = new StringBuilder();
				for (int k = len - 1; k >= 0; k--) {
					result.append(input.charAt(k));
				}
				result.append("\n");
				bw.write(result.toString());
			}
			bw.flush();

		} catch (IOException e) {

		}

	}
}
