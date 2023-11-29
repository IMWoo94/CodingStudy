package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27327
 */
public class 時間Hour {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int day = Integer.parseInt(br.readLine());
			int result = day * 24;

			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
