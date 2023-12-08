package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/24723
 */
public class 녹색거탑 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int high = Integer.parseInt(br.readLine());

			int count = (int)Math.pow(2, high);

			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
