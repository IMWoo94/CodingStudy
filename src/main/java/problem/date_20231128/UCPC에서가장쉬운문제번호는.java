package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/25311
 */
public class UCPC에서가장쉬운문제번호는 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int year = Integer.parseInt(br.readLine());
			if (year >= 2018 && year <= 2022) {
				bw.write("A");
				bw.flush();
			}
		} catch (IOException e) {

		}
	}
}
