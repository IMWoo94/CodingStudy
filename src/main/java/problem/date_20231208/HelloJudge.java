package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/9316
 */
public class HelloJudge {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 1; i <= count; i++) {
				bw.write("Hello World, Judge " + i + "!\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
