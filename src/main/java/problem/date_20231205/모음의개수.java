package problem.date_20231205;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1264
 */
public class 모음의개수 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String word = "aeiou";
			while (true) {
				String input = br.readLine();
				if (input.equals("#")) {
					break;
				}

				String lower = input.toLowerCase();
				long count = Arrays.stream(lower.split("")).filter(word::contains).count();
				bw.write(count + "");
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {

		}

	}
}
