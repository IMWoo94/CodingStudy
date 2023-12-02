package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/3046
 */
public class R2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int r1 = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int r2 = s * 2 - r1;

			bw.write(r2 + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
