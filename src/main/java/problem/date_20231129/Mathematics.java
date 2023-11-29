package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/26545
 */
public class Mathematics {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int i = 0; i < count; i++) {
				sum += Integer.parseInt(br.readLine());
			}

			bw.write(sum + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
