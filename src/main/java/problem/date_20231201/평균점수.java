package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/10039
 */
public class 평균점수 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int avg = 0;
			for (int i = 0; i < 5; i++) {
				int score = Integer.parseInt(br.readLine());
				if (score < 40) {
					score = 40;
				}
				avg += score;
			}
			avg /= 5;
			bw.write(avg + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
