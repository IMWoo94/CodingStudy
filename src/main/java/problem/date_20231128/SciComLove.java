package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/21598
 */
public class SciComLove {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			bw.write("SciComLove\n".repeat(count));
			bw.flush();
		} catch (IOException e) {

		}
	}
}
