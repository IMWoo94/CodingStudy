package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27389
 */
public class Metronome {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int num = Integer.parseInt(br.readLine());
			double result = num / 4.0;

			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
