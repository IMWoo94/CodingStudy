package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/19698
 */
public class 헛간청약 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int rowCnt = W / L;
			int colCnt = H / L;
			int total = rowCnt * colCnt;
			if (total >= N) {
				bw.write(N + "");
			} else {
				bw.write(total + "");
			}

			bw.flush();
		} catch (IOException e) {

		}

	}
}
