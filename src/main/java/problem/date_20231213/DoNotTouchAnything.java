package problem.date_20231213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/13136
 */
public class DoNotTouchAnything {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long r = Integer.parseInt(st.nextToken());
			long c = Integer.parseInt(st.nextToken());
			long n = Integer.parseInt(st.nextToken());
			long col = r % n == 0 ? (r / n == 0 ? 1 : r / n) : r / n + 1;
			long row = c % n == 0 ? (c / n == 0 ? 1 : c / n) : c / n + 1;
			long cctv = col * row;

			bw.write(cctv + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
