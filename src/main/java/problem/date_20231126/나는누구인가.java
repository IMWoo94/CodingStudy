package problem.date_20231126;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/15733
 */
public class 나는누구인가 {
	public static void main(String[] args) {
		try (
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			bw.write("I'm Sexy");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
