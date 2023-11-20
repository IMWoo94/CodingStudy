package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/15964
 */
public class 이상한기호 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long result = madeCal(a, b);

			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}
	}

	public static long madeCal(long a, long b) {
		return (a + b) * (a - b);
	}
}
