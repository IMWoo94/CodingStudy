package problem.date_20231120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/2754
 */
public class 학점계산 {
	public static void main(String[] args) throws IOException {
		Map<String, Double> scoreInfo = new HashMap<String, Double>() {
			{
				put("A+", 4.3);
				put("A0", 4.0);
				put("A-", 3.7);
				put("B+", 3.3);
				put("B0", 3.0);
				put("B-", 2.7);
				put("C+", 2.3);
				put("C0", 2.0);
				put("C-", 1.7);
				put("D+", 1.3);
				put("D0", 1.0);
				put("D-", 0.7);
				put("F", 0.0);
			}
		};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String score = br.readLine();

		System.out.println(scoreInfo.get(score));

	}
}
