package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/4470
 */
public class 줄번호 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int line = Integer.parseInt(br.readLine());
			for (int i = 1; i <= line; i++) {
				System.out.printf("%d. %s\n", i, br.readLine());
			}
		} catch (IOException e) {

		}

	}
}
