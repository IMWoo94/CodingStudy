package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/14935
 */
public class FA {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			while (true) {
				int size = input.length();
				int a = Integer.parseInt(input.substring(0, 1));
				String x = size * a + "";
				if (x.equals(input)) {
					bw.write("FA");
					break;
				} else {
					input = x;
				}
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
