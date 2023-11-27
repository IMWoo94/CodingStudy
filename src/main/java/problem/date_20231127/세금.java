package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/20492
 */
public class 세금 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int prize = Integer.parseInt(br.readLine());

			int origin = (int)(prize * 0.78);
			int other = (int)(prize * 0.8 + (prize * 0.2) - (prize * 0.2 * 0.22));

			bw.write("" + origin);
			bw.newLine();
			bw.write("" + other);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
