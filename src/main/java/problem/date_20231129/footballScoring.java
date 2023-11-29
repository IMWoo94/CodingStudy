package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/24736
 */
public class footballScoring {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int[] score = {6, 3, 2, 1, 2};
			String input;
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < 2; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int sum = 0;
				int count = st.countTokens();
				for (int i = 0; i < count; i++) {
					sum += score[i] * Integer.parseInt(st.nextToken());
				}
				sb.append(sum + " ");
			}

			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
