package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/2744
 */
public class 대소문자바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isLowerCase(c)) {
				sb.append(String.valueOf(c).toUpperCase());
				continue;
			}
			sb.append(String.valueOf(c).toLowerCase());
		}
		try (BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))) {
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
