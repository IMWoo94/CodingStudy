package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/29699
 */
public class wecolmetoSMUPC {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String word = "WelcomeToSMUPC";
			int find = Integer.parseInt(br.readLine()) % word.length();
			int index = find == 0 ? 13 : find - 1;
			bw.write(word.charAt(index));
			bw.flush();
		} catch (IOException e) {

		}

	}
}
