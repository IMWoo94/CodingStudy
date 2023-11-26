package problem.date_20231126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/15680
 */
public class 연세대학교 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			if (input.equals("0")) {
				bw.write("YONSEI");
			} else {
				bw.write("Leading the Way to the Future");
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
