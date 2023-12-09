package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/4299
 */
public class AFC윔블던 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if ((A + B) % 2 != 0 || A < B) {
				bw.write("-1");
			} else {
				int resultA = (A + B) / 2;
				int resultB = (A + B) / 2 - B;
				bw.write(resultA + " " + resultB);
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
