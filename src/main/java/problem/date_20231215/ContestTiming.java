package problem.date_20231215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/5928
 */
public class ContestTiming {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int d = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int result = 0;
			if (d == 11) {
				result = ((h * 60) + (m)) - ((11 * 60) + (11));
				if (result < 0) {
					result = -1;
				}
			} else {
				result = ((d * 24 * 60) + (h * 60) + (m)) - ((11 * 24 * 60) + (11 * 60) + (11));
			}
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
