package problem.date_20231102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.acmicpc.net/problem/8958
 */
public class OX퀴즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < cnt; i++) {
			result.add(counting(br.readLine()));
		}

		for (Integer i : result) {
			System.out.println(i);
		}
	}

	private static int counting(String score) {
		int count = 0;
		String[] split = score.split("X");
		for (String s : split) {
			for (int i = 1; i <= s.length(); i++) {
				count += i;
			}
		}
		return count;
	}
}
