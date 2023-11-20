package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2920
 */
public class 음계 {
	public static void main(String[] args) {
		String ascending = "cdefgabC";
		StringBuilder st = new StringBuilder(ascending);
		String descending = st.reverse().toString();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();
			while (token.hasMoreTokens()) {
				int index = Integer.parseInt(token.nextToken()) - 1;
				sb.append(ascending.charAt(index));
			}
			String result = sb.toString();
			if (result.equals(ascending)) {
				bw.write("ascending");
			} else if (result.equals(descending)) {
				bw.write("descending");
			} else {
				bw.write("mixed");
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
