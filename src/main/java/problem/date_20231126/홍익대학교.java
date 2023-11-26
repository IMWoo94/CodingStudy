package problem.date_20231126;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/16394
 */
public class 홍익대학교 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int year = Integer.parseInt(br.readLine());
			int origin = 1946;

			int result = year - origin;

			bw.write("" + result);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
