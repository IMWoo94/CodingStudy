package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/16486
 */
public class 운동장한바퀴 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int d1 = Integer.parseInt(br.readLine());
			int d2 = Integer.parseInt(br.readLine());

			double total = d1 * 2 + d2 * 2 * 3.141592;
			bw.write(total + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
