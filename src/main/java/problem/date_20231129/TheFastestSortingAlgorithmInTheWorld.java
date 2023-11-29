package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/23235
 */
public class TheFastestSortingAlgorithmInTheWorld {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input;
			int count = 1;
			StringBuilder sb = new StringBuilder();
			while ((input = br.readLine()) != null) {
				if (input.equals("0")) {
					break;
				}
				sb.append(String.format("Case %d: Sorting... done!\n", count));
				count++;
			}
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
