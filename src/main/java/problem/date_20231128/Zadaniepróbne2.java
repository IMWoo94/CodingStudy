package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/8871
 */
public class Zadaniepróbne2 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int round = Integer.parseInt(br.readLine());
			String result = (round * 2 + 2) + " " + (round * 3 + 3);
			bw.write(result);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
