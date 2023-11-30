package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27324
 */
public class ゾロ目SameNumbers {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			if (input.charAt(0) == input.charAt(1)) {
				bw.write("1");
			} else {
				bw.write("0");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
