package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2475
 */
public class 검증수 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			long result = createVerificationNumber(br.readLine());
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}
	}

	public static long createVerificationNumber(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		long sum = 0;
		while (st.hasMoreTokens()) {
			String ch = st.nextToken();
			double temp = Math.pow(Long.parseLong(ch), 2);
			sum += (long)temp;
		}
		return sum % 10;
	}
}
