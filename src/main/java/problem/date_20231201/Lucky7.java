package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/30224
 */
public class Lucky7 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String num = br.readLine();
			String result;
			if (num.contains("7")) {
				result = Integer.parseInt(num) % 7 == 0 ? "3" : "2";
			} else {
				result = Integer.parseInt(num) % 7 == 0 ? "1" : "0";
			}

			bw.write(result);
			bw.flush();
		} catch (IOException e) {

		}

	}
}
