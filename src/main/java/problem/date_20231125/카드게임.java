package problem.date_20231125;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5522
 */
public class 카드게임 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				int score = Integer.parseInt(br.readLine());
				sum += score;
			}
			bw.write("" + sum);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
