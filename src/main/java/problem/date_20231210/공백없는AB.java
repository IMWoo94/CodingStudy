package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/15873
 */
public class 공백없는AB {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			int len = input.length();
			int sum = 0;
			if (!input.contains("0")) {
				String[] split = input.split("");
				sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();
			} else {
				if (input.startsWith("10")) {
					sum = Integer.parseInt(input.substring(0, 2)) + Integer.parseInt(input.substring(2, len));
				} else {
					sum = Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(1, len));
				}
			}

			bw.write(sum + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
