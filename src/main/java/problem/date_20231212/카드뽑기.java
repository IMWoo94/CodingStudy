package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/16204
 */
public class 카드뽑기 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cardTotal = Integer.parseInt(st.nextToken());
			int oCount = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int xCount = cardTotal - oCount;

			int result = 0;

			if (K >= oCount) {
				result = cardTotal - (K - oCount);
			} else {
				result = K + xCount;
			}
			bw.write(result + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
