package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/18409
 */
public class 母音を数えるCountingVowels {
	public static void main(String[] args) {
		String match = "aiueo";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int len = Integer.parseInt(br.readLine());
			String word = br.readLine();
			int count = 0;
			for (char c : word.toCharArray()) {
				if (match.indexOf(String.valueOf(c)) != -1) {
					count++;
				}
			}
			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
